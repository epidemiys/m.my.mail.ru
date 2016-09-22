package ru.my.mail.tests.friends;

import org.testng.annotations.Test;
import ru.my.mail.model.TestBase;

/**
 * Created by aleksandr.petrov on 22.09.16.
 */
public class FriendsListPagination extends TestBase {

    @Test

    public void testFriendsListPagination(){
        app.getNavigationHelper().goToFriendPage();
    }
}
