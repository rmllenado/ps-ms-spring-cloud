package pluralsight.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@EnableTurbineStream
@SpringBootApplication
public class PluralsightTurbineStreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightTurbineStreamApplication.class, args);
	}

}
