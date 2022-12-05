package ru.buttonone;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

import static ru.buttonone.TestConstants.*;
import static ru.buttonone.XpathConstants.*;

@DisplayName("Проверка элементов страницы Яндекс:")
public class SeleniumXpathHomeWorkEachSeparatelyTest {
    public static ChromeDriver driver = new ChromeDriver();
    public static String originalWindow = driver.getWindowHandle();

    @BeforeAll
    public static void launchBrowser() {
        System.setProperty(WEBDRIVER_BROWSER_DRIVER, BROWSER_DRIVER);
        driver.navigate().to(YA_RU);
    }

    @AfterAll
    public static void closeBrowserPage() {
        driver.quit();
    }

    @DisplayName(" корректно кликнуть HeadlineLogo")
    @Test
    public void shouldHaveCorrectClickHeadlineLogo() {
        WebElement element_1 = driver.findElement(ELEMENT_1_XPATH);
        element_1.click();
    }

    @DisplayName(" корректно кликнуть EnterHome")
    @Test
    public void shouldHaveCorrectClickEnterHome() {
        WebElement element_2 = driver.findElement(ELEMENT_2_XPATH);
        element_2.click();
        WebElement elementEnterHomePage = driver.findElement(ELEMENT_2_XPATH_HOME_PAGE);
        Assertions.assertEquals("Войдите с Яндекс ID", elementEnterHomePage.getText());
        driver.navigate().back();
        driver.navigate().refresh();
    }

    @DisplayName(" корректно кликнуть AllServices")
    @Test
    public void shouldHaveCorrectClickAllServices() {
        WebElement element_3 = driver.findElement(ELEMENT_3_XPATH);
        element_3.click();
        WebElement elementAllServicesWindow = driver.findElement(ELEMENT_3_XPATH_ALL_SERVICES);
        Assertions.assertEquals("Больше сервисов", elementAllServicesWindow.getText());
        driver.navigate().refresh();
    }

    @DisplayName(" корректно кликнуть UserMenuWindow")
    @Test
    public void shouldHaveCorrectClickUserMenuWindow() {
        WebElement element_4 = driver.findElement(ELEMENT_4_XPATH);
        element_4.click();
        WebElement elementUserMenuWindow = driver.findElement(ELEMENT_4_XPATH_USER_MENU_WINDOW);
        Assertions.assertEquals("Войти в Яндекс", elementUserMenuWindow.getText());
        driver.navigate().refresh();
    }

    @DisplayName(" корректно кликнуть SearchInputBar")
    @Test
    public void shouldHaveCorrectClickSearchInputBar() {
        WebElement element_5 = driver.findElement(ELEMENT_5_XPATH);
        element_5.click();
        WebElement elementSearchInputBar = driver.findElement(ELEMENT_5_XPATH_SEARCH_INPUT_BAR);
        Assertions.assertEquals("найдётся всё", elementSearchInputBar.getAttribute(ATTRIBUTE_PLACEHOLDER));
        driver.navigate().refresh();
    }

    @DisplayName(" корректно кликнуть WeatherHomePage")
    @Test
    public void shouldHaveCorrectClickWeatherHomePage() {
        WebElement element_6 = driver.findElement(ELEMENT_6_XPATH);
        element_6.click();
        pageLoad(driver, ELEMENT_6_XPATH);
        ArrayList<String> weatherTab = new ArrayList<>(driver.getWindowHandles());
        weatherTab.remove(originalWindow);
        driver.switchTo().window(weatherTab.get(0));
        WebElement elementWeatherHomePage = driver.findElement(ELEMENT_6_XPATH_WEATHER_HOME_PAGE);
        Assertions.assertEquals("Прогноз на 10 дней", elementWeatherHomePage.getAttribute(ATTRIBUTE_ARIA_LABEL));
        driver.close();
        driver.switchTo().window(originalWindow);
    }

    @DisplayName(" корректно кликнуть TrafficPage")
    @Test
    public void shouldHaveCorrectClickTrafficPage() {
        WebElement element_7 = driver.findElement(ELEMENT_7_XPATH);
        element_7.click();
        pageLoad(driver, ELEMENT_7_XPATH);
        ArrayList<String> trafficTab = new ArrayList<>(driver.getWindowHandles());
        trafficTab.remove(originalWindow);
        driver.switchTo().window(trafficTab.get(0));
        WebElement elementTrafficPage = driver.findElement(ELEMENT_7_XPATH_TRAFFIC_PAGE);
        Assertions.assertEquals("Дорожная ситуация", elementTrafficPage.getText());
        driver.close();
        driver.switchTo().window(originalWindow);
    }

    @DisplayName(" корректно кликнуть UsdMoexPage")
    @Test
    public void shouldHaveCorrectClickUsdMoexPage() {
        WebElement element_8 = driver.findElement(ELEMENT_8_XPATH);
        element_8.click();
        pageLoad(driver, ELEMENT_8_XPATH);
        ArrayList<String> usdMoexTab = new ArrayList<>(driver.getWindowHandles());
        usdMoexTab.remove(originalWindow);
        driver.switchTo().window(usdMoexTab.get(0));
        WebElement elementUsdMoexPage = driver.findElement(ELEMENT_8_XPATH_USD_MOEX_PAGE);
        Assertions.assertEquals("Московская биржа", elementUsdMoexPage.getText());
        driver.close();
        driver.switchTo().window(originalWindow);
    }

    @DisplayName(" корректно кликнуть EurMoexPage")
    @Test
    public void shouldHaveCorrectClickEurMoexPage() {
        WebElement element_9 = driver.findElement(ELEMENT_9_XPATH);
        element_9.click();
        pageLoad(driver, ELEMENT_9_XPATH);
        ArrayList<String> eurMoexTab = new ArrayList<>(driver.getWindowHandles());
        eurMoexTab.remove(originalWindow);
        driver.switchTo().window(eurMoexTab.get(0));
        WebElement elementEurMoexPage = driver.findElement(ELEMENT_9_XPATH_EUR_MOEX_PAGE);
        Assertions.assertEquals("EUR MOEX", elementEurMoexPage.getAttribute(ATTRIBUTE_VALUE));
        driver.close();
        driver.switchTo().window(originalWindow);
    }

    @DisplayName(" корректно кликнуть GeoNomeTab")
    @Test
    public void shouldHaveCorrectClickGeoNomeTab() {
        WebElement element_10 = driver.findElement(ELEMENT_10_XPATH);
        element_10.click();
        pageLoad(driver, ELEMENT_10_XPATH);
        ArrayList<String> geoHomeTab = new ArrayList<>(driver.getWindowHandles());
        geoHomeTab.remove(originalWindow);
        driver.switchTo().window(geoHomeTab.get(0));
        WebElement elementGeoHomePage = driver.findElement(ELEMENT_10_XPATH_GEO_HOME_PAGE);
        Assertions.assertEquals("Местоположение Текущая страница", elementGeoHomePage.getAttribute(ATTRIBUTE_ARIA_LABEL));
        driver.close();
        driver.switchTo().window(originalWindow);
    }

    public void pageLoad(WebDriver driver, By by) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(by));
        } catch (Exception ex) {
            System.out.println("Element not found!");
        }
    }
}
