package com.example.pack1;

import com.example.pack2.ConfigA;
import com.example.springbeanstest.A;
import com.example.springbeanstest.B;
import org.springframework.context.annotation.*;

@Configuration
@Import(ConfigA.class)
//@ComponentScan("com.example.pack2")
public class ConfigB {
	static int b = 0;

	@Bean
	@Scope(value = "application1")
	public B getB(A a1, A a2) {
		b++;
		return new B(a1, a2);
	}
}
