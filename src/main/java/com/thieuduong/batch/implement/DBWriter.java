package com.thieuduong.batch.implement;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.thieuduong.batch.model.User;
import com.thieuduong.batch.repository.UserRepository;

@Component
public class DBWriter implements ItemWriter<User> {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void write(List<? extends User> users) throws Exception {
		System.out.println("Data Saved for Users: " + users);
		userRepository.save((User) users);
	}
}
