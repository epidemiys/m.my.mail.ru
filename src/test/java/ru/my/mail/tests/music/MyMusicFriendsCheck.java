package ru.my.mail.tests.music;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.my.mail.model.TestBase;

/**
 * Created by aleksandr.petrov on 21.09.16.
 */
public class MyMusicFriendsCheck extends TestBase {

    @Test

    public void testMyMusicFriendsCheck(){
        app.getNavigationHelper().goToMyMusicPage();
        app.getNavigationHelper().goToMyMusicFriends();
        Assert.assertTrue(app.getMusicHelper().checkShowMore());
        Assert.assertTrue(app.getMusicHelper().checkFirstFriend());
    }
}
