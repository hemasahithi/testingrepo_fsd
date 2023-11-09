package seleniumscripts;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Handlingvariouswebelements {

	public static void main(String[] args) {
		
        // Launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        // Navigate to Google homepage
        driver.get("https://www.google.com");

        // Step 4.5.1: Edit box
        // Enter a value in the search box
        driver.findElement(By.name("q")).sendKeys("Hello World");

        // Clear the value
        driver.findElement(By.name("q")).clear();

        // Check enabled status of the search box
        boolean isSearchBoxEnabled = driver.findElement(By.name("q")).isEnabled();

        // Check search box existence
        boolean doesSearchBoxExist = driver.findElements(By.name("q")).size() > 0;

        // Get the value from the search box
        String searchBoxValue = driver.findElement(By.name("q")).getAttribute("value");

        // Step 4.5.2: Link
        // Click the "Images" link
        driver.findElement(By.linkText("Images")).click();

        // Check the "Images" link existence
        boolean doesImagesLinkExist = driver.findElements(By.linkText("Images")).size() > 0;

        // Check the "Images" link enabled status
        boolean isImagesLinkEnabled = driver.findElement(By.linkText("Images")).isEnabled();

        // Return the "Images" link name
        String imagesLinkName = driver.findElement(By.linkText("Images")).getText();

        // Step 4.5.3: Button
        // Click the "Google Search" button
        driver.findElement(By.name("btnK")).click();

        // Check enabled status of the "Google Search" button
        boolean isSearchButtonEnabled = driver.findElement(By.name("btnK")).isEnabled();

        // Display status of the "Google Search" button
        boolean isSearchButtonDisplayed = driver.findElement(By.name("btnK")).isDisplayed();

        // Step 4.5.4: Image, image link, and image button
        // Operations on Image

        // Step 4.5.5: Text area
        // Return / Capture Text Area or Error message from a web page
        String textAreaValue = driver.findElement(By.tagName("textarea")).getAttribute("value");

        // Step 4.5.6: Checkbox
        // Check if the "I'm Feeling Lucky" checkbox is displayed or not
        boolean isFeelingLuckyCheckboxDisplayed = driver.findElement(By.name("btnI")).isDisplayed();

        // Check if the "I'm Feeling Lucky" checkbox is enabled or not
        boolean isFeelingLuckyCheckboxEnabled = driver.findElement(By.name("btnI")).isEnabled();

        // Check if the "I'm Feeling Lucky" checkbox is selected or not
        boolean isFeelingLuckyCheckboxSelected = driver.findElement(By.name("btnI")).isSelected();

        // Select the "I'm Feeling Lucky" checkbox
        driver.findElement(By.name("btnI")).click();

        // Unselect the "I'm Feeling Lucky" checkbox
        driver.findElement(By.name("btnI")).click();

        // Step 4.5.7: Radio button
        // Select the "Search" radio button
        driver.findElement(By.cssSelector("input[name='tbm'][value='s']")).click();

        // Verify if the "Search" radio button is displayed or not
        boolean isSearchRadioButtonDisplayed = driver.findElement(By.cssSelector("input[name='tbm'][value='s']")).isDisplayed();

        // Verify if the "Search" radio button is enabled or not
        boolean isSearchRadioButtonEnabled = driver.findElement(By.cssSelector("input[name='tbm'][value='s']")).isEnabled();

        // Verify if the "Search" radio button is selected or not
        boolean isSearchRadioButtonSelected = driver.findElement(By.cssSelector("input[name='tbm'][value='s']")).isSelected();

        // Step 4.5.8: Drop-down list
        // Check the drop-down box existence
        boolean doesDropDownExist = driver.findElements(By.name("lang")).size() > 0;

        // Check if the drop-down box is enabled or not
        boolean isDropDownEnabled = driver.findElement(By.name("lang")).isEnabled();

        // Select an item from the drop-down list
        Select dropdown = new Select(driver.findElement(By.name("lang")));
        dropdown.selectByVisibleText("English");
        dropdown.selectByValue("fr");

        // Get the count of items in the drop-down list
        int itemCount = dropdown.getOptions().size();

        // Step 4.5.9: Web table/HTML table
        // Get cell value from a table
        String cellValue = driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]")).getText();

        // Get the count of rows in a table
        int rowCount = driver.findElements(By.xpath("//table/tbody/tr")).size();

        // Get the count of cells in a table row
        int cellCount = driver.findElements(By.xpath("//table/tbody/tr[1]/td")).size();

        // Step 4.5.10: Frame
        // Switch from the default content to a frame
        driver.switchTo().frame("frameName");

        // Switch back from a frame to the default content
        driver.switchTo().defaultContent();

        // Step 4.5.11: Switching between tabs in the same browser window
        // Open a new tab
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");

        // Switch to the newly opened tab
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        // Perform operations in the new tab

        // Switch back to the old tab
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");
        driver.switchTo().defaultContent();

        // Perform operations in the old tab

        // Close the browser
        driver.quit();
    }

		

	}


