package Testpkg;

import org.testng.annotations.Test;

import Pagepkg.Fbcreatepage;


public class Fbcreatepage1 extends Baseclass{
	@Test
	public void cretepagetest()
	{
		Fbcreatepage ob=new Fbcreatepage(driver);
		ob.process();
	}


}
