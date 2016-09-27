package ru.my.mail.tests.friends;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.my.mail.model.TestBase;

/**
 * Created by aleksandr.petrov on 20.09.16.
 */
public class FriendsFormCheck extends TestBase {

    @Test
    public void testFriendsForm() {
        app.getNavigationHelper().goToFriendPage();
        app.getNavigationHelper().gotoMyFirstFriend();
        Assert.assertTrue(app.getProfileHelper().checkProfileAvatar());
        Assert.assertTrue(app.getProfileHelper().checkProfilePhotoButtom());
        Assert.assertTrue(app.getProfileHelper().checkProfileFriendsButtom());
        Assert.assertTrue(app.getProfileHelper().checkProfileGroupsButtom());
        Assert.assertTrue(app.getProfileHelper().checkProfilePresentsButton());
        Assert.assertTrue(app.getProfileHelper().checkProfileVideoButton());
        Assert.assertTrue(app.getProfileHelper().checkFirstEvent());
        Assert.assertTrue(app.getProfileHelper().checkMoreNews());
    }
}