package ru.my.mail.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by aleksandr.petrov on 20.09.16.
 */
public class SessionHelper extends HelperBase {

    public SessionHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void login(String username, String password) {
        type(By.name("Login"), username);
        type(By.name("Password"), password);
        click(By.xpath("//div[@class='heightContent']/form/div[3]/input"));
    }
}
