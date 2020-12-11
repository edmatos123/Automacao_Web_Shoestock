import Core.ConfigAcesso;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ComprarProduto extends ConfigAcesso {
    protected Interacoes Int = new Interacoes(Driver);


    public ComprarProduto(WebDriver Driver)
    {
        super(Driver);
    }

    public Interacoes Pesquisar(String Produto)
    {

        Int.waitElementVisible(10000,By.id("search-input"));
        Int.SendValues(By.id("search-input"),Produto);

        Int.waitElementClick(10000,By.xpath("/html/body/div[2]/header/div/div/section[2]/section/form/div/button"));
        Int.ClickButton(By.xpath("/html/body/div[2]/header/div/div/section[2]/section/form/div/button"));

        Int.waitElementClick(10000,By.xpath("//*[@id=\"item-list\"]/div/div[1]/div[1]/a"));
        Int.ClickButton(By.xpath("//*[@id=\"item-list\"]/div/div[1]/div[1]/a"));

        return  new Interacoes(getDriver());
    }

    public Interacoes IncluirCarrinho()
    {

        Int.waitElementVisible(1000,By.xpath("/html/body/div[2]/main/div[2]/section/section[3]/section[2]/div/ul/li[1]/a"));
        Int.ClickButton(By.xpath("/html/body/div[2]/main/div[2]/section/section[3]/section[2]/div/ul/li[1]/a"));

        Int.Scroll();

        Int.waitElementClick(1000, By.xpath("/html/body/div[2]/main/div[2]/section/section[3]/section[3]/div/button"));
        Int.ClickButton(By.xpath("/html/body/div[2]/main/div[2]/section/section[3]/section[3]/div/button"));

        Int.waitElementClick(10000,By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div[1]/div/a[1]"));
        Int.ClickButton(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div[1]/div/a[1]"));

        Int.waitElementVisible(10000,By.xpath("/html/body/div[2]/div[1]/section/div/div[1]/form/div[1]/input"));
        Int.SendValues(By.xpath("/html/body/div[2]/div[1]/section/div/div[1]/form/div[1]/input"),"edmilson08101996@gmail.com");

        Int.waitElementVisible(1000,By.xpath("/html/body/div[2]/div[1]/section/div/div[1]/form/div[2]/input"));
        Int.SendValues(By.xpath("/html/body/div[2]/div[1]/section/div/div[1]/form/div[2]/input"),"123456");

        Int.waitElementClick(1000,By.xpath("/html/body/div[2]/div[1]/section/div/div[1]/form/div[5]/button"));
        Int.ClickButton(By.xpath("/html/body/div[2]/div[1]/section/div/div[1]/form/div[5]/button"));

        return new Interacoes(getDriver());
    }

    public Interacoes ValidarCompra(String Produto)
    {

        Int.waitElementVisible(10000,By.xpath("//*[@id=\"payment-information\"]/div[1]/div/div/div/ul/li/div[2]/strong"));
        Int.CompararString(Produto,By.xpath("//*[@id=\"payment-information\"]/div[1]/div/div/div/ul/li/div[2]/strong"));

        return  new Interacoes(getDriver());
    }


}
