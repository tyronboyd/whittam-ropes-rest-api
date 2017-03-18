package com.whittam.ropes.controller;

import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.View;

import com.whittam.ropes.service.OrderService;

public class OrderControllerMockMvcTest {

	private MockMvc mockMvc;

	@InjectMocks
	private OrderController unitUnderTest = new OrderController();

	@Mock
	OrderService orderService;

	// Setup
	@Before
	public void before() {
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(unitUnderTest).setSingleView(mock(View.class)).build();
	}

	@Test
	public void testGetOrders() throws Exception {

		MvcResult result = mockMvc.perform(get("/order")
				.contentType(MediaType.APPLICATION_JSON))				
				.andExpect(status().is2xxSuccessful()).andReturn();
		assertFalse(result.getResponse().getContentAsString().isEmpty());
	}
}
