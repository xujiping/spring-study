package com.springinaction.springidol;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.springidol.common.PerformanceException;

public class JugglerTest {
	
	@Autowired
	ApplicationContext context;
	
	@Before
	public void before(){
		context = new ClassPathXmlApplicationContext("classpath:spring.xml");
	}
	
	@Test
	public void testDuke() throws PerformanceException{
		Performer performer = (Performer) context.getBean("duke");
		performer.perform();
	}
	
	@Test
	public void testSonnet29(){
		Poem poem = (Poem) context.getBean("sonnet29");
		poem.recite();
	}
	
	@Test
	public void testPoeticJuggler() throws PerformanceException{
		Performer performer = (Performer) context.getBean("poeticDuke");
		performer.perform();
	}
	
	@Test
	public void testkenny() throws PerformanceException{
		Performer performer = (Performer) context.getBean("kenny");
		performer.perform();
	}
	
	@Test
	public void testHunk() throws PerformanceException{
		Performer performer =  (Performer) context.getBean("hank2");
		performer.perform();
	}

}
