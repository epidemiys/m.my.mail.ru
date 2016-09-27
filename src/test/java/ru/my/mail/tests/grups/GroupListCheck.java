package ru.my.mail.tests.grups;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.my.mail.model.TestBase;

/**
 * Created by aleksandr.petrov on 21.09.16.
 */
public class GroupListCheck extends TestBase {

    @Test

    public void testElementPresent(){
        app.getNavigationHelper().goToGroupPage();
        Assert.assertTrue(app.getGroupHelper().checkSearchInputForm());
        Assert.assertTrue(app.getGroupHelper().checkFirstGroup());
        Assert.assertTrue(app.getGroupHelper().checkGroupMebmerCount());
        Assert.assertTrue(app.getGroupHelper().checkMoreGroupButtom());

    }

}
