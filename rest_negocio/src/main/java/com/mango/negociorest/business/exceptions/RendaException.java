package com.mango.negociorest.business.exceptions;

public class RendaException extends Exception {

    private static final long serialVersionUID = 7718828512143293558L;

    public RendaException() {
        super("A renda deve ser informada, com um número maior que zero!");
    }

}
