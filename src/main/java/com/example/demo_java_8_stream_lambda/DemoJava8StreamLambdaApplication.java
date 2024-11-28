package com.example.demo_java_8_stream_lambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.function.Consumer;

@SpringBootApplication
public class DemoJava8StreamLambdaApplication {
	static  int value = 1;
	public static void main(String[] args) {

		SpringApplication.run(DemoJava8StreamLambdaApplication.class, args);


		int i = 0; // local variable

		Consumer<Integer> c1 = (i1) -> {
			System.out.println(">>>>>>>>>>>> i1 : "+i1);
			System.out.println(value++);
		};
		c1.accept(21);


//Summary Table:
//Variable Type	Can Modify in Lambda?	Reason
//Local Variables	❌ No	    Must be final/effectively final for thread safety.
//Instance Variables✅ Yes	    Stored on the heap; accessible and mutable.
//Static Variables	✅ Yes	    Shared across instances; accessible and mutable.
//Method Parameters	❌ No	    Must be effectively final for thread safety.
}

}
