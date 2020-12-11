import Core.ConfigAcesso;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Interacoes extends ConfigAcesso {

    public Interacoes(WebDriver Driver)
    {
        super(Driver);
    }


    public void ClickButton (By by){
        WebElement search = Driver.findElement(by);
        search.click();
    }

    public void SendValues(By by,String texto){
        WebElement values = Driver.findElement(by);
        values.sendKeys(texto);
    }

    public void waitElementVisible(int temp, By by) {
        WebDriverWait wait = new WebDriverWait(Driver, temp);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
           }
    public void waitElementClick(int temp, By by) {
        WebDriverWait wait = new WebDriverWait(Driver, temp);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public  void Scroll()
    {

        JavascriptExecutor jsx = (JavascriptExecutor)Driver;
        jsx.executeScript("window.scrollBy(0,450)", "");
    }

    public void CompararString(String Produto,By by)
    {

            WebElement Menu = Driver.findElement(by);
            String CapturarTexto = Menu.getText();

            if (CapturarTexto.equals(Produto))
            {
                System.out.println(CapturarTexto+" é igual "+Produto+" - "+"TESTE OK!!!!!!");
            }
            else {
                System.out.println(CapturarTexto+" é diferente "+Produto+" - "+"TESTE NOK!!!!!!");
            }

    }

}







