package com.oracle.web.test;

import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:application.xml","file:/SSM_CRUD/src/main/webapp/WEB_INF/dispatcherServlet-servlet.xml"})
@WebAppConfiguration
public class TestController {
	
	@Autowired
	WebApplicationContext context;
	
	//模拟发送请求
	
	MockMvc mvc;
	
	@Before(value = "")
	public void init(){
		
		mvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	@Test
	public void testPage() throws Exception{
		
		mvc.perform(MockMvcRequestBuilders.get("monstershowPageMonster/1").param("参数名", "caa")).andReturn();
		
	}

}
