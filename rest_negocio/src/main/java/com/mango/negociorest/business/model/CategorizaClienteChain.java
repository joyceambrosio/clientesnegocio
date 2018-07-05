package com.mango.negociorest.business.model;

import java.util.ArrayList;

final class CategorizaClienteChain {

    protected ArrayList<ITratador> tratadores;

    public CategorizaClienteChain() throws Exception {
        tratadores = new ArrayList<>();
        addTratador(new BronzeTratador());
        addTratador(new PrataTratador());
        addTratador(new OuroTratador());
    }

    private void addTratador(ITratador tratador) throws Exception {
        this.tratadores.add(tratador);
    }

    public void processar(ClienteBusiness cliente) throws Exception {
        for (ITratador tratador : tratadores) {
            if (tratador.accept(cliente)) {
                tratador.trata(cliente);
            }
        }
    }
}
