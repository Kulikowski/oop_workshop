package com.dev2hero;

import org.junit.Test;

import com.dev2hero.utils.PropertyReader;

public class PropertyReaderTest {

	@Test
	public void testReadPropertyFile(){
		PropertyReader.loadPropertyValues();
		System.out.println("Hero base name is: "+System.getProperty("config.superHeroBaseName"));
	}
}
