package com.example.pack2;

import com.example.springbeanstest.A;
import org.springframework.context.annotation.*;


@Configuration
public class ConfigA {
	static int a = 0;

	@Bean
	@Scope(value = "singleton")
	public A getA() {
		a++;
		return new A();
	}
}


