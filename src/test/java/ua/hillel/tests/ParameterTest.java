package ua.hillel.tests;

import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class ParameterTest {

    @Test
    @Parameters({"url", "browser"})

    public void parameterizedTest(String url, String browser) {
        System.out.println("Тест з параметрами ззовні");
        System.out.println("Параметри:");
        System.out.println("Параметр 1: " + url);
        System.out.println("Параметр 2: " + browser);
    }
}

