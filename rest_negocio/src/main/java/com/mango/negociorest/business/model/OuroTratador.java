package com.mango.negociorest.business.model;

class OuroTratador implements ITratador {

    @Override
    public boolean accept(ClienteBusiness cliente) {
        return (cliente.getRenda() >= 3000.00);
    }

    @Override
    public void trata(ClienteBusiness cliente) {
        cliente.setClassificacao("Ouro");
    }

}
