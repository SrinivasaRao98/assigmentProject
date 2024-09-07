import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;

public class loginAndFileuploadScreenshort {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //navigating to webpage
        driver.get(" https://demo.dealsdray.com/");
        // entering user name
        WebElement name = driver.findElement(By.name("username"));
        name.sendKeys("prexo.mis@dealsdray.com");
        // entering the password
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("prexo.mis@dealsdray.com");
        // login to webpage
        WebElement submitBTN = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/form/div[3]/div/button"));
        submitBTN.click();
        Thread.sleep(3000);
        // clicking on order menu
        WebElement orderBtn =  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[1]/div[2]/button"));
        orderBtn.click();
        WebElement ordersBtn = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/a/button"));
        ordersBtn.click();
        Thread.sleep(2000);
        // directing to file_page
        WebElement addBulkBtn = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[2]/button"));
        addBulkBtn.click();
        Thread.sleep(2000);
        WebElement fileSelect = driver.findElement(By.xpath("//*[@id=\"mui-7\"]"));
        //Uploading a file
        fileSelect.sendKeys("C:\\Users\\srini\\OneDrive\\Desktop\\demo-data.xlsx");
        WebElement submitBtn = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[3]/button"));
        submitBtn.click();

        // taking screenshot of the webpage
        TakesScreenshot ts = (TakesScreenshot)driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("./screenshot/loginandfile1.png"));

        // quiting window
        driver.quit();
    }

}
