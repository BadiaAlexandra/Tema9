package ro.digitalnation.restuflWebService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
"ro.digitalnation.activitati", "ro.digitalnation.basic","ro.digitalnation.restuflWebService"})
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}
