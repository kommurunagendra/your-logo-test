package com.kommuru.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

/**
 * The class is a runner file where is used to run all the scenarios.
 *
 * @author Reddy
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "target/test-classes"},
        plugin = {
                "pretty", "html:target/your-logo-test-report",
                "json:target/your-logo-test-report/cucumber.json",
                "rerun:target/your-logo-test-report/rerun.txt"},
        tags = "@test",
        glue = {"com/kommuru/steps/"})
public class RunnerTest {
}
