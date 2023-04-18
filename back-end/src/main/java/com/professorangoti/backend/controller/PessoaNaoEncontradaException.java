package com.professorangoti.backend.controller;

public class PessoaNaoEncontradaException extends RuntimeException {

    PessoaNaoEncontradaException(Integer id) {
        super("Não encontrei pessoa " + id);
    }

}