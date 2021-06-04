package dev.sirdir;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Arrays;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StartWebDriverTest {

    @BeforeTest
    public void setUp() {
        Configuration.browser = "dev.sirdir.CustomDriverProvider";
    }

    @Test
    public void printOutAllCommandLineArgumentWheStartingChrome() {
        open("chrome://version");
        System.out.println(); // here are suppose to be debug point OR ->
        // if locator still present it will print all command lines to console
        String commandLineArguments = $("#command_line").text();
        Arrays.stream(commandLineArguments.split(" ")).forEach(System.out::println);
    }
}
