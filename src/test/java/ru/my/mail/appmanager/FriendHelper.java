package ru.my.mail.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by aleksandr.petrov on 20.09.16.
 */
public class FriendHelper {
    private FirefoxDriver wd;

    public FriendHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void openFriendPhotos() {
        wd.findElement(By.xpath("//*[@id='wrap']/div[5]/ul/li[1]/a/span[2]/span/span[1]")).click();
    }
}
