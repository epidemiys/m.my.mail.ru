package ru.my.mail.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by aleksandr.petrov on 20.09.16.
 */
public class NavigationHelper {
    private FirefoxDriver wd;

    public NavigationHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void goToPublisherPage() {
        wd.findElement(By.cssSelector("a.menu__item.m-publish")).click();
    }

    public void goToFriendPage() {
        wd.findElement(By.xpath("//*[@id='leftmenu']/div[4]/a/i")).click();

    }
}
