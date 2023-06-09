package Emanuele.example.run;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.github.javafaker.Faker;

import Emanuele.example.entities.User;
import Emanuele.example.service.UserService;

public class UserRunner implements CommandLineRunner{
	
	@Autowired
	UserService us;

	@Override
	public void run(String... args) throws Exception {
		Faker faker = new Faker(new Locale("it"));
		
		for(int j = 0 ; j<= 20; j++){
			
			String name = faker.name().firstName();
			String lastName = faker.name().lastName();
			String email = faker.internet().emailAddress();
			String username = faker.name().username();
			String password = faker.internet().password();
			
			User user = new User();
			
			user.setName(name);
			user.setLastName(lastName);
			user.setEmail(email);
			user.setUserName(username);
			user.setPassword(password);
			
			us.Create(user);
		};
	}

}
