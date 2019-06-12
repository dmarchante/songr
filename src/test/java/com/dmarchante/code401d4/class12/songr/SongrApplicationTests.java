package com.dmarchante.code401d4.class12.songr;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SongrApplicationTests {

	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
	}

	@Test
	public void testHelloPage()
			throws Exception {

		MockHttpServletRequestBuilder builder = MockMvcRequestBuilders
				.get("/hello");

		ResultMatcher contentMatcher = MockMvcResultMatchers.content()
				.string("Hello world!");

		this.mockMvc.perform(builder).andExpect(contentMatcher)
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testCapitalizePage()
			throws Exception {

		MockHttpServletRequestBuilder builder = MockMvcRequestBuilders
				.get("/capitalize/hello");

		ResultMatcher contentMatcher = MockMvcResultMatchers.content()
				.string("HELLO");

		this.mockMvc.perform(builder).andExpect(contentMatcher)
				.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void testReversePage()
			throws Exception {

		MockHttpServletRequestBuilder builder = MockMvcRequestBuilders
				.get("/reverse?sentence=hello world");

		ResultMatcher contentMatcher = MockMvcResultMatchers.content()
				.string("world hello");

		this.mockMvc.perform(builder).andExpect(contentMatcher)
				.andExpect(MockMvcResultMatchers.status().isOk());
	}
}
