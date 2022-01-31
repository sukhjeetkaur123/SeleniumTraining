package Seleniumpkg;


import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class AssignmentBBc{
public static void main(String[] args) {
    // TODO Auto-generated method stub

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\SukhjeetKaur\\Downloads\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.get("https://www.bbc.com/");
    List<WebElement> linktext = driver.findElements(By.tagName("a"));
    System.out.println(linktext.size());
    for(int i = 0;i<linktext.size();i++){
        String linktxt = linktext.get(i).getText();
        String linkurl  = linktext.get(i).getAttribute("href");
        System.out.println(linktxt+"    "+linkurl);

    }
    }
}


		
