package seleniumscripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewaystolocateelements {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

        // Launch the website
        driver.get("https://www.seleniumhq.org");

        // Step 4.3.1: Using ID as a Locator
        WebElement downloadTab = driver.findElement(By.id("menu_download"));
        downloadTab.click();

        // Step 4.3.2: Using class name as a Locator
        WebElement versionsTab = driver.findElement(By.className("version"));
        versionsTab.click();

        // Step 4.3.3: Using Name as a Locator
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("Selenium WebDriver");

        // Step 4.3.4: Using LinkText as a Locator
        WebElement aboutTab = driver.findElement(By.linkText("About"));
        aboutTab.click();

        // Step 4.3.5: Using Xpath as a Locator
        // Relative Xpath
        WebElement relativeElement = driver.findElement(By.xpath("//a[@class='navbar-brand']"));
        relativeElement.click();

        // Absolute Xpath
        WebElement absoluteElement = driver.findElement(By.xpath("/html/body/div[1]/div[1]/a"));
        absoluteElement.click();

        // Step 4.3.6: Using CSS Selector as a Locator
        // Tag and ID
        WebElement downloadButton = driver.findElement(By.cssSelector("a#downloadSeleniumBtn"));
        downloadButton.click();

        // Tag and Class
        WebElement projectName = driver.findElement(By.cssSelector("h1.project-name"));
        System.out.println("Project Name: " + projectName.getText());

        // Step 4.3.7: Using Xpath for handling complex and dynamic elements
        // Contains()
        WebElement projectsLink = driver.findElement(By.xpath("//*[contains(text(),'Projects')]"));
        projectsLink.click();

        // Close the browser
        driver.quit();

		

	}

}
