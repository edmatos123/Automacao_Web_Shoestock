import Core.ConfigAcesso;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Chamadas {

    private static ConfigAcesso Driver = null;
    private  static ComprarProduto ComProd = null;
    private  static String Produto = null;

    @BeforeClass
    public static void VerificarParam()
    {
        Driver = new ConfigAcesso();
        ComProd = new ComprarProduto(Driver.getDriver());
        Produto = "Sapato Social Couro Shoestock Brogue Masculino";
    }


    public ConfigAcesso acessarNavegador()
    {
        return Driver;
    }

    @Test
    public void aPesquisar()
    {
        ComProd.Pesquisar(Produto);
    }

    @Test
    public void bIncluir()
    {
        ComProd.IncluirCarrinho();

    }

    @Test
    public void cValidar()
    {
        ComProd.ValidarCompra(Produto);
    }



}
