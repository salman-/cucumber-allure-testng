package org.example.utility;

import org.openqa.selenium.WebDriver;
/**
 * Utility class to manage WebDriver instances in a thread-safe manner using {@link ThreadLocal}.
 * <p>
 * This is especially useful for parallel test execution, where each thread needs its own
 * isolated WebDriver instance.
 *
 * <p>Typical usage in test frameworks like Selenium with Cucumber/TestNG:
 * <ul>
 *     <li>Call {@link #setDriver(WebDriver)} during setup (e.g., in a {@code @Before} hook).</li>
 *     <li>Access the current thread's driver using {@link #getDriver()} in your step definitions or test methods.</li>
 *     <li>Call {@link #quitDriver()} during teardown (e.g., in a {@code @After} hook) to properly clean up.</li>
 * </ul>
 */
public class DriverManager {

    /**
     * Thread-local storage for WebDriver instances.
     * Ensures each thread gets its own isolated instance.
     */
    private static final ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    /**
     * Retrieves the WebDriver instance for the current thread.
     *
     * @return the {@link WebDriver} associated with the current thread, or {@code null} if not set.
     */
    public static WebDriver getDriver() {
        return driverThreadLocal.get();
    }

    /**
     * Assigns a WebDriver instance to the current thread.
     *
     * @param driver the {@link WebDriver} instance to set for the current thread
     */
    public static void setDriver(WebDriver driver) {
        driverThreadLocal.set(driver);
    }

    /**
     * Quits the WebDriver associated with the current thread and removes it from thread-local storage.
     * <p>
     * This helps prevent memory leaks and ensures proper cleanup after test execution.
     */
    public static void quitDriver() {
        if (driverThreadLocal.get() != null) {
            driverThreadLocal.get().quit();
            driverThreadLocal.remove();
        }
    }
}
