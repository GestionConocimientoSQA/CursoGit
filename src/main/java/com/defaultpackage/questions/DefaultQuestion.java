package com.defaultpackage.questions;
/*
 * @(#) DefaultQuestion.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class DefaultQuestion implements Question<Boolean> {
    private final String name;

    public DefaultQuestion(String name) {
        this.name = name;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}
