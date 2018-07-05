package com.mango.negociorest.business.model;


import com.mango.negociorest.business.exceptions.NomeException;
import com.mango.negociorest.business.exceptions.RendaException;
import com.mango.negociorest.clienteInterface.ICliente;


public final class ClienteBusiness implements ICliente {

    private long id;
    private String nome;
    private int idade;
    private double renda = 0.0;
    private double limiteDeCredito = 0.0;
    private String classificacao;
    private CategorizaClienteChain processador = new CategorizaClienteChain();

    public ClienteBusiness() throws Exception {
 
    }

    public ClienteBusiness(String nome, int idade, double renda) throws Exception {
        this();
        setNome(nome);
        setIdade(idade);
        setRenda(renda);
        processador.processar(this);
    }

    public ClienteBusiness(long id, String nome, int idade, double renda, double limiteDeCredito, String classificacao) throws Exception {
        this();
        if (id <= 0) {
            throw new Exception("O cliente deve existir na banse de dados");
        }
        setId(id);
        this.nome = nome;
        this.idade = idade;
        this.renda = renda;
        this.limiteDeCredito = limiteDeCredito;
        this.classificacao = classificacao;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public void setNome(String nome) throws Exception {
        if (!nome.contains(" ")) {
            throw new NomeException();
        }
        this.nome = nome;
    }

    @Override
    public void setIdade(int idade) throws Exception {
        if (idade <= 0) {
            throw new RendaException();
        }
        this.idade = idade;
    }

    @Override
    public void setRenda(double renda) throws Exception {
        if (renda <= 0) {
            throw new RendaException();
        }
        this.renda = renda;
        setLimiteDeCredito(getRenda() * .4);
        processador.processar(this);
    }

    private void setLimiteDeCredito(double limiteDeCredito) {
        this.limiteDeCredito = limiteDeCredito;
    }

    protected void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public double getRenda() {
        return renda;
    }

    @Override
    public double getLimiteDeCredito() {
        return limiteDeCredito;
    }

    @Override
    public String getClassificacao() {
        return classificacao;
    }

}
