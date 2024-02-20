

import org.junit.After;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//test21
public class test2{
	//edit1, edit2 edit3inhub, edit4, edit5, edit6, edit7, edit8, edit9, editsel
	
	private WebDriver webDriver;
	
	@Before
	public void beforeMethod() throws Exception {
		webDriver = new FirefoxDriver();
	}
	
	@After
	public void afterMethod() throws Exception {
		webDriver.quit();
	}
	
	@Test
	public void testHomePageTitle(){
		webDriver.get("http://spree.newcircle.com");
		Assert.assertEquals("Spree Demo Site", webDriver.getTitle());
	}
}
