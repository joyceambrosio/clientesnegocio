package com.mango.negociorest.business.exceptions;

public class NomeException extends Exception {

    private static final long serialVersionUID = 7718828512143293558L;

    public NomeException() {
        super("Informe um nome e sobrenome!");
    }

}
