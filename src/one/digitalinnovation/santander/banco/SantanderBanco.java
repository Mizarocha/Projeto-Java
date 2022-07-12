package one.digitalinnovation.santander.banco;

import one.digitalinnovation.santander.angencias.Agencia;
import one.digitalinnovation.santander.angencias.WayAgencia;
import one.digitalinnovation.santander.botoes.AppBotoesWay;
import one.digitalinnovation.santander.botoes.Botoes;

public class SantanderBanco implements ProBanco {
    @Override
    public Botoes criarBotoes() {
        return new AppBotoesWay();
    }

    @Override
    public Agencia criarAgencia() {
        return new WayAgencia();
    }
}
