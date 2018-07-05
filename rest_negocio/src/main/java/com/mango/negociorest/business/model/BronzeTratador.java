package com.mango.negociorest.business.model;

class BronzeTratador implements ITratador {

    @Override
    public boolean accept(ClienteBusiness cliente) {
        return cliente.getRenda() <= 1000.00;
    }

    @Override
    public void trata(ClienteBusiness cliente) {
        cliente.setClassificacao("Bronze");
    }

}
