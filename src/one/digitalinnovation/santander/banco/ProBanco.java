package one.digitalinnovation.santander.banco;


import one.digitalinnovation.santander.angencias.Agencia;
import one.digitalinnovation.santander.botoes.Botoes;

public interface ProBanco {
  Botoes criarBotoes();
  Agencia criarAgencia();

}

