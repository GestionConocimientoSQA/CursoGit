package com.defaultpackage.tasks;
/*
 * @(#) Default3Task.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class Default3Task implements Task {
    private final Boolean res;

    public Default3Task(Boolean res) {
        this.res = res;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
