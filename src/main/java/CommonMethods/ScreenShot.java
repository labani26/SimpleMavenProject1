package CommonMethods;
//Meaning-This class belongs to the package named CommonMethods.
//Packages help organize Java files.
//
//Example:PageObjects,Tests,Utilities
//Think of package like a folder.

import java.io.File;
//Why?Used to create and handle files in Java.
//
//Example:screenshot.png,excel.xlsx
//Without this, Java cannot understand File.

import java.io.IOException;
//Sometimes file operations fail:File path wrong,Permission issue,File not found
//IOException handles those errors.

import org.apache.commons.io.FileUtils;
//Used to copy screenshot file from temporary location to your folder.
//Without this:screenshot will not save properly.

import org.openqa.selenium.OutputType;
//OutputTypes-Tells Selenium in which format screenshot should be taken.
//Types:FILE,BASE64,BYTES

import org.openqa.selenium.TakesScreenshot;
//WebDriver itself cannot take screenshots directly.
//We convert/cast driver into TakesScreenshot.

import org.openqa.selenium.WebDriver;

//Why?Main Selenium interface to control browser.
//Example:ChromeDriver,EdgeDriver

public class ScreenShot {

    WebDriver driver;
    
//    Creating driver reference variable.
//    This driver will:  open browser, interact with webpage, take screenshot

    // Constructor
    //What is constructor?A constructor initializes objects.
    
    public ScreenShot(WebDriver driver) {
        this.driver = driver;
        //this.driver = class variable
       // driver = constructor parameter
        //s0, store passed driver into class variable.
    }

    // Method to take screenshot
    public void shot() throws IOException {

//    	public
//    	→ accessible anywhere
//    	void
//    	→ returns nothing
//    	shot()
//    	→ method name
//    	throws IOException
//    	→ may throw file-related error
    	
        // Take screenshot and store in File format
        File screenShotFile = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE);
        
//        (TakesScreenshot) driver
//        Meaning-Type casting.
//        Convert normal driver into screenshot-capable driver.
//        Because:
//        	WebDriver → cannot directly take screenshot
//        	TakesScreenshot → can take screenshot
        
//        .getScreenshotAs(OutputType.FILE)
//        Meaning-Take screenshot in file format.
//        Selenium captures current browser screen.

//        File screenShotFile
//        Meaning-Store screenshot temporarily as a file.
        
        // Destination where screenshot will be saved
        File destination = new File(
                "C:\\Users\\Labani sardar\\git\\SimpleSelenium-MavenProject1\\SimpleMavenProject1\\resource\\screenshot.png");
//        Why double slash \\?
//        		In Java:\ is escape character
//        		So:
//        		\\ means actual backslash.
//        		Why .png?
//        		Because screenshot is image file.

        // Copy screenshot file to destination
        FileUtils.copyFile(screenShotFile, destination);
//        Meaning-Copy screenshot from:
//        temporary Selenium location
//        To:
//        your desired folder
        
        System.out.println("Screenshot taken successfully for this code.");
    }
}


//Browser Opens
//↓
//Driver Passed to Screenshot Class
//↓
//Driver Converted to TakesScreenshot
//↓
//Screenshot Captured
//↓
//Stored Temporarily
//↓
//Copied to Your Folder