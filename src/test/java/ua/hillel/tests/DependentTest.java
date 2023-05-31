package ua.hillel.tests;

import org.testng.annotations.*;
import org.testng.Assert;

public class DependentTest {

    @BeforeMethod(alwaysRun = true, groups = "dependent")
    public void setup() {
        System.out.println("Перед початком тесту2");
    }

    @Test(dependsOnGroups = "login", groups = "dependent")
    public void dependentTest() {
        System.out.println("Другий тест, залежний від групи login");
    }

    @AfterMethod(alwaysRun = true, groups = "dependent")
    public void cleanup() {
        System.out.println("Після тесту 2");
    }
}

