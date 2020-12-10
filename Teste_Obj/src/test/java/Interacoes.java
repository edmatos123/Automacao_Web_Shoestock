import Core.ConfigAcesso;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Interacoes extends ConfigAcesso {

/*Toda page precisa ter uma construtor que alimente a propriedade navegador, do tipo WebDriver*/
    public Interacoes(WebDriver Driver){
        super(Driver);
    }

    public void ClickButton (By by){
        WebElement search = Driver.findElement(by);
        search.click();
    }

    public void SendValues(By by,String texto){
        WebElement Login = Driver.findElement(by);
        Login.sendKeys(texto);
    }






}
