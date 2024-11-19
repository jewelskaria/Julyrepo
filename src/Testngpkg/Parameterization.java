package Testngpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Parameterization {
@Parameters("s")
	@Test
	public void test(String s)
	{
		System.out.println(s);
	}

}
