package com.codrite.cucumber.cucumberlearnings;

import cucumber.api.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
@PropertySource("classpath:application.yml")
@Slf4j
public class TestFeatureGlue {

    @Value("${test.env}")
    private String testEnvironment;

    public TestFeatureGlue() {
        log.debug(" Testing Environment : " + testEnvironment);
    }

    @When("^the client calls /version$")
    public void the_client_calls_version() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

}
