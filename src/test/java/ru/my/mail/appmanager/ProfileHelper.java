package ru.my.mail.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by aleksandr.petrov on 20.09.16.
 */
public class ProfileHelper extends HelperBase {

    public ProfileHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void openFriendPhotos() {
        click(By.xpath(".//*[@class='profile-menu__tile m-photo']"));
    }
}
