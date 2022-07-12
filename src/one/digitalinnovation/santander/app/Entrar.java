package one.digitalinnovation.santander.app;

import one.digitalinnovation.santander.angencias.Agencia;
import one.digitalinnovation.santander.banco.ProBanco;
import one.digitalinnovation.santander.botoes.Botoes;

/**Os usuários do banco não se importam com qual banco eles usam, pois trabalham com
 * bancos e produtos através de interfaces abstratas.
 *
 * @author Mizarocha
*/
public class Entrar {
    private Botoes botoes;
    private Agencia agencia;

    public Entrar(ProBanco banco) {
        botoes = banco.criarBotoes();
        agencia = banco.criarAgencia();
    }

    public void paint(){
        botoes.paint();
        agencia.paint();
    }

}



