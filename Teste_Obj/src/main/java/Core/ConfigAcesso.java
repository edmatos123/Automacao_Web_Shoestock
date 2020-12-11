package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ConfigAcesso {
    protected WebDriver Driver;
    public String Url = "https://www.shoestock.com.br/";


    public ConfigAcesso(WebDriver Driver)
    {
        this.Driver = Driver;
    }

    public ConfigAcesso()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Resource\\Driver\\chromedriver.exe");
        Driver = new ChromeDriver();
        Driver.manage().window().maximize();
        Driver.get(Url);
        Driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    }

    public WebDriver getDriver() {
        return Driver;
    }
}
