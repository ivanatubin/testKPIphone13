import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ivana\\Desktop\\Bootcamp\\novChrome\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.kupujemprodajem.com/");

        String title = driver.getTitle();
        String expected = "KupujemProdajem";

        if (title.equals(expected)) {
            System.out.println("Validno!");
        }

        WebElement el1 = driver.findElement(By.xpath("//*[@id=\"bodyTag\"]/div[9]/div/div[2]"));
        el1.click();
        System.out.println("Box zatvoren.");

       driver.manage().window().maximize();

        WebElement el2 = driver.findElement(By.id("searchKeywordsInput"));
        el2.sendKeys("iphone 13");
        el2.submit();

        WebElement prihvati = driver.findElement(By.xpath("//*[@id=\"cookieConsentHolder\"]/div/div/div[2]/input"));
        prihvati.click();

        WebElement el3 = driver.findElement(By.xpath("//*[@id=\"adDescription7321776\"]/div/section[2]/div[1]/div[1]/a"));
        el3.click();

        String acResult = driver.getTitle();
        String expResult = "iPhone 13, iPhone 12, iPhone 11 - NOVO! - KupujemProdajem";

        if (acResult.equals(expResult)){
            System.out.println("Uspesno!");
        } else {
            System.out.println("Greska!");
        }

        driver.close();
    }
}
