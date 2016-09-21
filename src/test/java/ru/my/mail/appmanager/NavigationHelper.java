package ru.my.mail.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by aleksandr.petrov on 20.09.16.
 */
public class NavigationHelper extends HelperBase {

    public NavigationHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void goToPublisherPage() {
        click(By.cssSelector("a.menu__item.m-publish"));
    }

    public void goToFriendPage() {
        click(By.xpath("//*[@class='leftmenu__pic m-friends']"));

    }

    public void goToMyProfilePage() {
        click(By.xpath("//*[@class='leftmenu__pic m-avatar']"));
    }

    public void goToGroupPage() {
        click(By.xpath("//*[@class='leftmenu__pic m-friends']"));
    }

    public void goToMyProfileFriends() {
        click(By.xpath("//*[@class='profile-menu__tile m-friends']"));
    }

    public void goToMyProfileGroups() {
        click(By.xpath("//*[@class='profile-menu__tile m-groups']"));
    }

    public void goToMyProfilePhoto() {
        click(By.xpath("//*[@class='profile-menu__tile m-photo']"));
    }

    public void goToMyProfilePresents() {
        click(By.xpath("//*[@class='profile-menu__tile m-gift']"));
    }

    public void goToMyProfileVideo() {
        click(By.xpath("//*[@class='profile-menu__tile m-video']"));
    }

    public void goToMyMusicPage() {
        click(By.xpath("//*[@class='leftmenu__pic m-music']"));
    }

    public void goToMyMusicCatalog() {
        click(By.xpath("//*[@class='tabs']/div[1]"));
    }

    public void goToMyMusicMyMusicPage() {
        click(By.xpath("//*[@class='tabs']/div[2]"));
    }

    public void goToMyMusicMyMusicPlaylistCheck() {
        //Необходимо оптимизировать xpath
        click(By.xpath("//*[@id='wrap']/div[5]/div[3]/div[2]/a"));
    }

    public void goToMyMusicFriends() {
        click(By.xpath("//*[@class='tabs']/div[3]"));
    }

    public void goToMyMusicMyReccomendationPage() {
        click(By.xpath("//*[@class='tabs']/div[4]"));
    }
}
