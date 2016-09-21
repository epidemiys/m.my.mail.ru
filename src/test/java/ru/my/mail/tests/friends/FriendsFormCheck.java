package ru.my.mail.tests.friends;

import org.testng.annotations.Test;
import ru.my.mail.model.TestBase;

/**
 * Created by aleksandr.petrov on 20.09.16.
 */
public class FriendsFormCheck extends TestBase {

    @Test
    public void testFriendsForm() {
        app.getNavigationHelper().goToFriendPage();
        /*
        Имя есть
        Возраст есть
        Страна есть
        Аватар есть
        Кнопка фото есть
        Кнопка друзья есть
        Кнопка группы есть
        Кнопка подарки есть
        Кнопка видео есть
        Лента есть
         */
    }
}