package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.demo.Contact;
import com.example.demo.DataBase;
@SpringBootApplication
@Configuration
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		DataBase db = (DataBase) ctx.getBean(DataBase.class);
		System.out.println("Name : " + db.getName());
		System.out.println("Password : " + db.getPassword());

		Contact cntc = (Contact) ctx.getBean(Contact.class);
		System.out.println("Email : " + cntc.getEmail());
		System.out.println("Phone : " + cntc.getPhone());
	
}
	@Value("${ekumeedhelp.name}")
	public String name;

	@Value("${ekumeedhelp.password}")
	public String password;

	@Value("${contact.emailId}")
	public String email;

	@Value("${contact.phone}")
	public String phone;

	@Bean
	public DataBase getDeatils() {
		DataBase db = new DataBase();
		// db.setName(env.getProperty("ENV.NAME"));
		db.setName("Prashant");
		db.setPassword(password);
		return db;
	}

	@Bean
	public Contact getContact() {
		Contact cntc = new Contact();
		cntc.setEmail(email);
		cntc.setPhone(phone);
		return cntc;
	}
}
