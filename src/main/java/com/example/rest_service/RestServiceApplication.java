package com.example.rest_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);

		// Start the Temporal worker
		// Worker worker = WorkerFactory.getInstance().newWorker("HelloWorldTaskQueue");
		// worker.registerWorkflowImplementationTypes(HelloWorldWorkflowImpl.class);
		// worker.registerActivitiesImplementations(new HelloWorldActivitiesImpl());
		// WorkerFactory.getInstance().start();

	}

}
