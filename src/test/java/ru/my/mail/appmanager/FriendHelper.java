package ru.my.mail.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by aleksandr.petrov on 20.09.16.
 */
public class FriendHelper extends HelperBase {

    public FriendHelper(FirefoxDriver wd) {
        super(wd);    }

    public void openFriendPhotos() {
        click(By.xpath("//*[@id='wrap']/div[5]/ul/li[1]/a/span[2]/span/span[1]"));
    }
}
