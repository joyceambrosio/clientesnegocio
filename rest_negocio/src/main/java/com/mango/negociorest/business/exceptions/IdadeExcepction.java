package com.mango.negociorest.business.exceptions;

public class IdadeExcepction extends Exception {

    private static final long serialVersionUID = 7718828512143293558L;

    public IdadeExcepction() {
        super("A idade deve ser um número inteiro positivo!");
    }

}
