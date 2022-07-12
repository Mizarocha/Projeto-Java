import one.digitalinnovation.santander.app.Entrar;
import one.digitalinnovation.santander.banco.ProBanco;
import one.digitalinnovation.santander.banco.SantanderBanco;
import one.digitalinnovation.santander.banco.WayBanco;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static class Demonstracao {

        private static Entrar configureEntrar(){
            Entrar app;
            ProBanco banco;
            String osNome = System.getProperty("os.nome").toLowerCase();
            if (osNome.contains("Santander")){
                banco = new SantanderBanco();
                app = new Entrar(banco);
            }else {
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
}