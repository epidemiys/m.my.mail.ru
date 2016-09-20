package ru.my.mail.tests;

import org.testng.annotations.Test;
import ru.my.mail.model.TestBase;

/**
 * Created by aleksandr.petrov on 20.09.16.
 */
public class FriendsForm extends TestBase {

    @Test
    public void testFriendsForm() {
        app.getNavigationHelper().goToFriendPage();
        app.getFriendHelperHelper().openFriendPhotos();
    }
}
