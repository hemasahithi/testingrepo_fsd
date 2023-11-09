
package seleniumscripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locatingusingcssandxpath {

	public static void main(String[] args) {
		

        // Launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        // Navigate to the W3Schools HTML Examples page
        driver.get("https://www.w3schools.com/html/html_examples.asp");

        // Locating elements using CSS selectors
        // Example 1: Tag and ID
        WebElement element1 = driver.findElement(By.cssSelector("a#topnavbtn_references"));

        // Example 2: Tag and Class
        WebElement element2 = driver.findElement(By.cssSelector("h2.w3-container.w3-red"));

        // Example 3: Tag and Attribute
        WebElement element3 = driver.findElement(By.cssSelector("img[alt='W3Schools.com']"));

        // Example 4: Tag, Class, and Attribute
        WebElement element4 = driver.findElement(By.cssSelector("div.w3-panel.w3-leftbar.w3-sand.w3-padding"));

        // Example 5: Inner text
        WebElement element5 = driver.findElement(By.cssSelector("a:contains('W3Schools')"));

        // Locating elements using XPath
        // Example 1: Absolute XPath
        WebElement element6 = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/div[4]/h2"));

        // Example 2: Relative XPath
        WebElement element7 = driver.findElement(By.xpath("//*[@class='w3-sidebar w3-bar-block w3-light-grey w3-card']//a[contains(text(),'Try it Yourself')]"));

        // Perform actions on the located elements
        // ...

        // Close the browser
        driver.quit();


	}

}
