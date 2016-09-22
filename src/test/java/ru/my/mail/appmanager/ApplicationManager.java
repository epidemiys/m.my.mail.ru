package ru.my.mail.appmanager;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by aleksandr.petrov on 20.09.16.
 */
public class ApplicationManager {

    FirefoxDriver wd;

    private NavigationHelper navigationHelper;
    private ProfileHelper profileHelper;
    private PublisherHelper publisherHelper;
    private SessionHelper sessionHelper;

    public void init() {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://m.my.mail.ru/cgi-bin/login");
        profileHelper = new ProfileHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        publisherHelper = new PublisherHelper(wd);
        sessionHelper = new SessionHelper(wd);
        sessionHelper.login("testqaqa", "Mytesting");
    }

    public void stop() {
        wd.quit();
    }

    public ProfileHelper getProfileHelper() {
        return profileHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public PublisherHelper getPublisherHelper() {
        return publisherHelper;
    }
}

