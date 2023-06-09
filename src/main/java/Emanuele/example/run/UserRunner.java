package Emanuele.example.run;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import Emanuele.example.service.UserService;

public class UserRunner implements CommandLineRunner{
	
	@Autowired
	UserService us;

	@Override
	public void run(String... args) throws Exception {
		
		
	}

}
