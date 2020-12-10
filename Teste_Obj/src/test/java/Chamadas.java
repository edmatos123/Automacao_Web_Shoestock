import Core.ConfigAcesso;
import org.junit.BeforeClass;
import org.junit.Test;

public class Chamadas {

    private static ConfigAcesso Driver = null;
    private  static ComprarProduto ComProd = null;

    @BeforeClass
    public static void VerificarParam()
    {
        Driver = new ConfigAcesso();
        ComProd = new ComprarProduto(Driver.getDriver());
    }


    public ConfigAcesso acessarNavegador() {
        return Driver;
    }

    @Test
    public void Pesquisar()
    {
        ComProd.Pesquisar();
    }



}
