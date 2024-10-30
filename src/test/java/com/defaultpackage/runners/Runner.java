package com.defaultpackage.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import org.openqa.selenium.devtools.v85.cachestorage.model.Cache;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/default.feature",
        glue = "com.defaultpackage.stepDef",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        publish = true
        )
public class Runner {
}