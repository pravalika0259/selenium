package sample;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","E:\\SeleniumPractice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		int a = 2,b=3,c=0;
		c = a + b;
		System.out.println(c);
		driver.close();	
				
	}

}
