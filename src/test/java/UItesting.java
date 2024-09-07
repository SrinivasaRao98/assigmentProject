import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;
public class UItesting {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // navigating to main webpage
        driver.navigate().to(" https://www.getcalley.com/page-sitemap.xml");

        // navigating to link1
        WebElement Link1 = driver.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[1]/td[1]"));
        Link1.click();

        // Desktop Screen Resolutions
        Dimension l3 = new Dimension(1536,864);
        driver.manage().window().setSize(l3);
        Thread.sleep(1000);
        Dimension l2 = new Dimension(1366,768);
        driver.manage().window().setSize(l2);
        Thread.sleep(1000);
        Dimension l1 = new Dimension(1920,1080);
        driver.manage().window().setSize(l1);
        Thread.sleep(1000);

        // Mobile Screen Resolutions
        Dimension d1_1 = new Dimension(360,640);
        driver.manage().window().setSize(d1_1);
        Thread.sleep(1000);
        Dimension d1_2 = new Dimension(414,896);
        driver.manage().window().setSize(d1_2);
        Thread.sleep(1000);
        Dimension d1_3 = new Dimension(375,667);
        driver.manage().window().setSize(d1_3);
        Thread.sleep(500);

        driver.manage().window().maximize();

        driver.navigate().back();
        // navigating to link2
        WebElement Link2 = driver.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[2]/td[1]/a"));
        Link2.click();

        // Desktop Screen Resolutions
        Dimension l2_3 = new Dimension(1536,864);
        driver.manage().window().setSize(l2_3);
        Thread.sleep(2000);
        Dimension l2_2 = new Dimension(1366,768);
        driver.manage().window().setSize(l2_2);
        Thread.sleep(2000);
        Dimension l2_1 = new Dimension(1920,1080);
        driver.manage().window().setSize(l2_1);
        Thread.sleep(2000);

        // Mobile Screen Resolutions
        Dimension d2_1 = new Dimension(360,640);
        driver.manage().window().setSize(d2_1);
        Thread.sleep(1000);
        Dimension d2_2 = new Dimension(414,896);
        driver.manage().window().setSize(d2_2);
        Thread.sleep(1000);
        Dimension d2_3 = new Dimension(375,667);
        driver.manage().window().setSize(d2_3);
        Thread.sleep(500);

        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.navigate().back();
        // navigating to link3
        WebElement Link3 = driver.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[3]/td[1]/a"));
        Link3.click();

        // Desktop Screen Resolutions
        Dimension l3_3 = new Dimension(1536,864);
        driver.manage().window().setSize(l3_3);
        Thread.sleep(2000);
        Dimension l3_2 = new Dimension(1366,768);
        driver.manage().window().setSize(l3_2);
        Thread.sleep(2000);
        Dimension l3_1 = new Dimension(1920,1080);
        driver.manage().window().setSize(l3_1);
        Thread.sleep(2000);

        // Mobile Screen Resolutions
        Dimension d3_1 = new Dimension(360,640);
        driver.manage().window().setSize(d3_1);
        Thread.sleep(1000);
        Dimension d3_2 = new Dimension(414,896);
        driver.manage().window().setSize(d3_2);
        Thread.sleep(1000);
        Dimension d3_3 = new Dimension(375,667);
        driver.manage().window().setSize(d3_3);
        Thread.sleep(500);

        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.navigate().back();
        // navigating to link4
        WebElement Link4 = driver.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[4]/td[1]/a"));
        Link4.click();

        // Desktop Screen Resolutions
        Dimension l4_3 = new Dimension(1536,864);
        driver.manage().window().setSize(l4_3);
        Thread.sleep(2000);
        Dimension l4_2 = new Dimension(1366,768);
        driver.manage().window().setSize(l4_2);
        Thread.sleep(2000);
        Dimension l4_1 = new Dimension(1920,1080);
        driver.manage().window().setSize(l4_1);
        Thread.sleep(2000);

        // Mobile Screen Resolutions
        Dimension d4_1 = new Dimension(360,640);
        driver.manage().window().setSize(d4_1);
        Thread.sleep(1000);
        Dimension d4_2 = new Dimension(414,896);
        driver.manage().window().setSize(d1_2);
        Thread.sleep(1000);
        Dimension d4_3 = new Dimension(375,667);
        driver.manage().window().setSize(d4_3);
        Thread.sleep(500);

        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.navigate().back();
        // navigating to link5
        WebElement Link5 = driver.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[5]/td[1]/a"));
        Link5.click();

        // Desktop Screen Resolutions
        Dimension l5_3 = new Dimension(1536,864);
        driver.manage().window().setSize(l5_3);
        Thread.sleep(2000);
        Dimension l5_2 = new Dimension(1366,768);
        driver.manage().window().setSize(l5_2);
        Thread.sleep(2000);
        Dimension l5_1 = new Dimension(1920,1080);
        driver.manage().window().setSize(l5_1);
        Thread.sleep(2000);

        // Mobile Screen Resolutions
        Dimension d5_1 = new Dimension(360,640);
        driver.manage().window().setSize(d5_1);
        Thread.sleep(1000);
        Dimension d5_2 = new Dimension(414,896);
        driver.manage().window().setSize(d5_2);
        Thread.sleep(1000);
        Dimension d5_3 = new Dimension(375,667);
        driver.manage().window().setSize(d5_3);
        Thread.sleep(500);

        driver.manage().window().maximize();
        //quiting windows
        driver.quit();
    }
}
