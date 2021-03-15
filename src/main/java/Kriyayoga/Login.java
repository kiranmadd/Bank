package Kriyayoga;



import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws MalformedURLException,Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Haribabu\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.costco.com");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,10000)");
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,1000)");
		/*driver.findElement(By.xpath("//div[@id='content-m']/ul/li[1]/a")).click();
		
		List<WebElement> actuallinks1 = driver.findElements(By.tagName("a"));
		
		List<WebElement> activelinks1 = new ArrayList<WebElement>();
		for(WebElement link : actuallinks1)
		{
			if(link.getAttribute("href")!=null)
				
				activelinks1.add(link);
		}
		
		System.out.println("Total number of links..."+activelinks1.size());
		for(WebElement link : activelinks1)
		{
			for(int i=0;i<activelinks1.size();i++)
		try {
			HttpURLConnection httpcon = (HttpURLConnection) new URL(link.getAttribute("href")).openConnection();
			httpcon.setReadTimeout(3000);
			String resmes = httpcon.getResponseMessage();
			if(resmes.equals("OK"))
				System.out.println(i+"..."+httpcon+".. is active");
			else
				System.out.println(i+"..."+httpcon+"...is inactive");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		}
		
		
			
		
		
		driver.findElement(By.xpath("//div[@id='content-m']/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//div[@id='content-m']/ul/li[2]/ul/li[1]/a")).click();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='content-m']/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//div[@id='content-m']/ul/li[2]/ul/li[2]/a")).click();
        
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='content-m']/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//div[@id='content-m']/ul/li[3]/ul/li[1]/a")).click();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='content-m']/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//div[@id='content-m']/ul/li[3]/ul/li[2]/a")).click();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='content-m']/ul/li[4]/a")).click();
        driver.navigate().back();
        driver.findElement(By.xpath("//div[@id='content-m']/ul/li[5]/a")).click();
        driver.findElement(By.xpath("//div[@id='content-m']/ul/li[5]/ul/li[1]/a")).click();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='content-m']/ul/li[5]/a")).click();
        driver.findElement(By.xpath("//div[@id='content-m']/ul/li[5]/ul/li[2]/a")).click();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='content-m']/ul/li[5]/a")).click();
        driver.findElement(By.xpath("//div[@id='content-m']/ul/li[5]/ul/li[3]/a")).click();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='content-m']/ul/li[5]/a")).click();
        driver.findElement(By.xpath("//div[@id='content-m']/ul/li[5]/ul/li[4]/a")).click();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='content-m']/ul/li[6]/a")).click();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='content-m']/ul/li[7]/a")).click();
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='content-m']/ul/li[8]/a")).click();
        
        */
        
        
	}

}
