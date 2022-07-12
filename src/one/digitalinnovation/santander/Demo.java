package one.digitalinnovation.santander;


import one.digitalinnovation.santander.app.Entrar;
import one.digitalinnovation.santander.banco.ProBanco;
import one.digitalinnovation.santander.banco.SantanderBanco;
import one.digitalinnovation.santander.banco.WayBanco;


/**
 * Uma demonstração de resultado. Tudo se junta aqui.
 * @author Mizarocha
  */


public class Demo {

   /**O aplicativo escolhe o tipo de banco e o cria em tempo de execução (geralmente em
    * fase de inicialização), dependendo da configuração ou ambiente
    *variáveis.
    *
    */
   private static Entrar configureEntrar(){
    Entrar app;
    ProBanco banco;
    String osName = System.getProperty("os.name").toLowerCase();
    if (osName.contains("santander")){
         banco = new SantanderBanco();
         app = new Entrar(banco);
    } else {
        banco = new WayBanco();
        app = new Entrar(banco);
      }
    return app;
  }

    public static void main(String[] args) {
        Entrar app = configureEntrar();
        app.paint();
    }

}
