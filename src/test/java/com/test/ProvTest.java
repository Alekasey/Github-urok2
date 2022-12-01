package com.test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.net.URL;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ProvTest {

    @BeforeAll
    static void beforeall() {
        Configuration.browser = "FireFox";
        Configuration.browserSize = "2100x1080";
    }
    @Test
    void StartSaitTest(){
        open("https://www.wikipedia.org/" );
        $("#searchInput").click();
        $("#searchInput").setValue("a");
        $(".suggestions-dropdown").$("[href=\"https://ru.wikipedia.org/wiki/Apple\"]").click();

        $("#firstHeading").shouldHave(text("Apple"));

   }
}


