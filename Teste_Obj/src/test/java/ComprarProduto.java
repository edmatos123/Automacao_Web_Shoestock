import Core.ConfigAcesso;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComprarProduto extends ConfigAcesso {
    protected Interacoes Int = new Interacoes(Driver);
    private  String Produto = "Sapato Social Couro Shoestock Bico Redondo Masculino";

    public ComprarProduto(WebDriver Driver){
        super(Driver);
    }

    public Interacoes Pesquisar()
    {
        Int.SendValues(By.id("search-input"),Produto);
        Int.ClickButton(By.xpath("//*[@id=\"header-content\"]/header/div/div/section[2]/section/form/div/button"));
        return  new Interacoes(getDriver());
    }


}
