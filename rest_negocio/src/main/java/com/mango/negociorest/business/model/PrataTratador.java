package com.mango.negociorest.business.model;

class PrataTratador implements ITratador {

    @Override
    public boolean accept(ClienteBusiness cliente) {
        return (cliente.getRenda() > 1000.00 && cliente.getRenda() < 3000.00);
    }

    @Override
    public void trata(ClienteBusiness cliente) {
        cliente.setClassificacao("Prata");
    }

}
