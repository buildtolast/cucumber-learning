package com.codrite.cucumber.cucumberlearnings;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@RunWith(Cucumber.class)
@CucumberOptions(features = "target/test-classes")
@SpringBootTest
@ActiveProfiles("local")
@Slf4j
public class CucumberLearningsApplicationTests {

	@Value("${test.env}")
	private String testEnvironment;

}
