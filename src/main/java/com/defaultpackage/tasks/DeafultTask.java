package com.defaultpackage.tasks;
/*
 * @(#) DeafultTask.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class DeafultTask implements Task {
    private final String variable1;

    public DeafultTask(String variable1) {
        this.variable1 = variable1;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo();

    }
}
