package com.mango.negociorest.clienteInterface;

public interface ICliente {

    String getClassificacao();

    long getId();

    int getIdade();

    double getLimiteDeCredito();

    String getNome();

    double getRenda();

    void setId(long id);

    void setIdade(int idade) throws Exception;

    void setNome(String nome) throws Exception;

    void setRenda(double renda) throws Exception;

}
