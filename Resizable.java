package week4day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/resizable");
		driver.switchTo().frame(0);
		WebElement obj = driver.findElement(By.id("resizable"));
		Actions builder=new Actions(driver);
		int wid=obj.getSize().width;
		builder.clickAndHold().moveByOffset(24, 36).release();
		builder.build().perform();

	}

}
