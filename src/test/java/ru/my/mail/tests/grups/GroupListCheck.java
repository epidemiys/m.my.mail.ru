package ru.my.mail.tests.grups;

import org.testng.annotations.Test;
import ru.my.mail.model.TestBase;

/**
 * Created by aleksandr.petrov on 21.09.16.
 */
public class GroupListCheck extends TestBase {

    @Test

    public void testElementPresent(){
        app.getNavigationHelper().goToGroupPage();
    }

}
