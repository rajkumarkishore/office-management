package oms.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("oms")
@EntityScan("oms.model")
public class OmsOfficeManagementSystemApplication{

	public static void main(String[] args) {
		SpringApplication.run(OmsOfficeManagementSystemApplication.class, args);
	}
}
