package com.openpay.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * <h2>OpenPay API Service — Main Application Entry Point</h2>
 * <p>
 * Bootstraps the Spring Boot application for the OpenPay API module.
 * </p>
 *
 * <ul>
 * <li>Scans for components, configurations, and services in the API module</li>
 * <li>Launches the embedded web server and initializes the application
 * context</li>
 * </ul>
 *
 * <h3>Usage:</h3>
 * 
 * <pre>
 *   $ java -jar api-service.jar
 * </pre>
 *
 * @author David Grace
 * @since 1.0
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.openpay.shared.repository")
@EntityScan(basePackages = {
    "com.openpay.shared.model"
})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
