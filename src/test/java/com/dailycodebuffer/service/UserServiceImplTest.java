package com.dailycodebuffer.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.dailycodebuffer.model.User;
import com.dailycodebuffer.repository.UserDao;

@SpringBootTest(classes = UserServiceImpl.class)
class UserServiceImplTest {
	
	@MockBean
	UserDao userDao;

	@Test
	public void savUserTest() {
		OngoingStubbing<Boolean> thenReturn = Mockito.when(userDao.saveUser(null)).thenReturn(true);
		
		assertNotNull(thenReturn);
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}
}
