package ru.netology.selenide;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AppCardDelivery01 {

    private String generateDate (int addDays, String pattern) {
        return LocalDate.now().plusDays(addDays).format(DateTimeFormatter.ofPattern(pattern));
    }

    @Test
    public void shouldBeSuccessfullyCompleted() {
        open( relativeOrAbsoluteUrl:"http://localhost:9999");
        $(cssSelector: "[data-test-id = 'date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.DELETE);
        //
        (cssSelector: "[data-test-id = 'date'] input")
        $(cssSelector:)("[data-test-id = 'name'] input")
        $(cssSelector:)("[data-test-id = 'phone'] input")
        $(cssSelector:) ("[data-test-id = 'agreement']")


    }




