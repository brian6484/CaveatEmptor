package com.example.CaveatEmptor;

import com.example.CaveatEmptor.user.User;
import com.example.CaveatEmptor.user.UserRepository;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
abstract class CaveatEmptorApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@BeforeAll
	void beforeAll(){
		userRepository.saveAll(generateUsers());
	}

	private static List<User> generateUsers(){
		List<User> list = new ArrayList<>();
		User john = new User("john", LocalDate.of(2021, Month.APRIL, 13));
		list.add(john);
		return list;
	}

	@AfterAll
	void afterAll(){
		userRepository.deleteAll();
	}

}
