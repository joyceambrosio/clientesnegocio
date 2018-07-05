package com.mango.negociorest.business.model;

interface ITratador {

    public boolean accept(ClienteBusiness cliente);

    public void trata(ClienteBusiness cliente);

}
