package com.mazecode.ci;

import com.mazecode.ci.controllers.BaseController;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ContinuousIntegrationTestApplicationTests {

	@InjectMocks
	private BaseController baseController;

	@Test
	public void contextLoads() throws Exception {
		assertThat(baseController).isNotNull();
	}
}
