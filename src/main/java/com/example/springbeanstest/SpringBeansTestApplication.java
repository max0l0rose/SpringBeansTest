package com.example.springbeanstest;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringBeansTestApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBeansTestApplication.class, args);
		int a = 1; // 3
	}
}


// DB ready!
@Component
@RequiredArgsConstructor
class AppStartupRunner implements ApplicationRunner {

	// Works
	@EventListener(ApplicationReadyEvent.class)
	public void doSomethingAfterStartup() {
		System.out.println("hello world, I have just started up"); //2
	}

	final A aa;
	final A aa2;

	@Override
	public void run(ApplicationArguments args)
	{
		int a = 1; //1
	}
}
