package com.analog.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/analog/step/definitions",
        dryRun = false,
        tags = "",
        publish = true
)
public class CucumberRunner {
}
