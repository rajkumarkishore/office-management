package oms.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("oms")
public class OmsOfficeManagementSystemApplication{

	public static void main(String[] args) {
		SpringApplication.run(OmsOfficeManagementSystemApplication.class, args);
	}
}
