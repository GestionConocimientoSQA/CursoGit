package com.defaultpackage.stepDef;
/*
 * @(#) StepDefinitionDefault.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import io.cucumber.java.es.*;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class StepDefinitionDefault {
    @Dado("default")
    public void default1() {

    }
    @Cuando("default")
    public void default2() {

    }
    @Cuando("default {int}")
    public void default3(Integer int1) {

    }
    @Entonces("default {int}")
    public void default4(Integer int1) {

    }
    @Entonces("default")
    public void default5() {

    }
    @Entonces("defaul {int}")
    public void default6(Integer int1) {

    }
}
