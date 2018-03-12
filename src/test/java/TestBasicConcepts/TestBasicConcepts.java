package TestBasicConcepts;

import org.testng.annotations.Test;

import BasicConcepts.JavaBasicConcepts;

public class TestBasicConcepts {
	
	JavaBasicConcepts obj =new JavaBasicConcepts();
	@Test
	public void testmethod()
	{
		obj.testprint();
		System.out.println("Sample Annonation: @Test");
	}
}
