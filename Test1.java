package webDriver_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String args[]) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("cheeese!");
		element.submit();
		System.out.println("page title is " + driver.getTitle());
	}
}



git workspace testing 



fsdds
sadf
sdfs
dasd
fsdsdaf