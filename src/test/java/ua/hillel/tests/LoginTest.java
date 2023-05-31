package ua.hillel.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {

    @Test(dataProvider = "loginDataProvider", groups = "login")
    public void loginTest(String username, String password, String role) {
        System.out.println("Тест на логін");
        System.out.println("Параметри:");
        System.out.println("Ім'я користувача: " + username);
        System.out.println("Пароль: " + password);
        System.out.println("Роль: " + role);
    }



    @DataProvider(name = "loginDataProvider")
    public Object[][] provideLoginData() {
        String [][] users = {
            {"Sanya", "123123", "admin"},
            {"Sasha", "32131", "guest"},
            {"Alex", "231231", "user"}
        };
            return users;
    }
}

