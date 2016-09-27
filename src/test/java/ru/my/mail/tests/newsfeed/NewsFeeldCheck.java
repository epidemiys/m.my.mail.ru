package ru.my.mail.tests.newsfeed;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.my.mail.model.TestBase;

/**
 * Created by aleksandr.petrov on 21.09.16.
 */
public class NewsFeeldCheck extends TestBase {

    @Test
/*
Необходимо переписать будет в будущем (найти первый элемент, в потом внутри него
element.findElement(локатор)найти первый элемент, в потом внутри него element.findElement(локатор))
 */
    public void testNewsFeeldCheck(){
        app.getNavigationHelper().goToNewsFeeld();
        Assert.assertTrue(app.getNewsHelper().checkNewsFeeldEvent());
        Assert.assertTrue(app.getNewsHelper().checkNewsFeeldSettingButtom());
        Assert.assertTrue(app.getNewsHelper().checkNewsFeeldComment());
        Assert.assertTrue(app.getNewsHelper().checkNewsFeeldLike());
    }
}
