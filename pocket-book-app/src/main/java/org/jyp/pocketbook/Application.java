package org.jyp.pocketbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages = { "org.jyp.pocketbook" })
//@MapperScan("org.jyp.pocketbook.db.dao")
//@EnableTransactionManagement
//@EnableScheduling
//@EnableWebMvc
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
