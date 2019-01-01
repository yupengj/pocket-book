package org.jyp.pocketbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "org.jyp.pocketbook" })
//@MapperScan("org.jyp.pocketbook.db.dao")
//@EnableTransactionManagement
//@EnableScheduling
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
