package ru.my.mail.tests.video;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.my.mail.model.TestBase;

/**
 * Created by aleksandr.petrov on 21.09.16.
 */
public class VideoListCheck extends TestBase {

    @Test

    public void testVideoListCheck(){
        app.getNavigationHelper().goToMyVideoPage();
        Assert.assertTrue(app.getVideoHelper().checkFindForm());
        Assert.assertTrue(app.getVideoHelper().checkFerstVideo());
        Assert.assertTrue(app.getVideoHelper().checkMoreVideoButtom());
    }
}
