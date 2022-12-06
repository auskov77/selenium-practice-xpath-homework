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
    private ChromeDriver driver;
    private String originalWindow;

    @BeforeEach
    public void launchBrowser() {
        System.setProperty(WEBDRIVER_BROWSER_DRIVER, BROWSER_DRIVER);
        driver = new ChromeDriver();
        driver.navigate().to(YA_RU);
        originalWindow = driver.getWindowHandle();
    }

    @AfterEach
    public void closeBrowserPage() {
        driver.quit();
    }

    @DisplayName(" корректно кликнуть HeadlineLogo")
    @Test
    public void shouldHaveCorrectClickHeadlineLogo() {
        WebElement headLineLogo = driver.findElement(HEAD_LINE_LOGO);
        headLineLogo.click();
    }

    @DisplayName(" корректно кликнуть EnterHome")
    @Test
    public void shouldHaveCorrectClickEnterHome() {
        WebElement enterHome = driver.findElement(ENTER_HOME);
        enterHome.click();
        WebElement elementEnterHomePage = driver.findElement(ELEMENT_ENTER_HOME_PAGE);
        Assertions.assertEquals("Войдите с Яндекс ID", elementEnterHomePage.getText());
        driver.navigate().back();
        driver.navigate().refresh();
    }

    @DisplayName(" корректно кликнуть AllServices")
    @Test
    public void shouldHaveCorrectClickAllServices() {
        WebElement allServicesWindow = driver.findElement(ALL_SERVICES_WINDOW);
        allServicesWindow.click();
        WebElement elementAllServicesWindow = driver.findElement(ELEMENT_ALL_SERVICES_WINDOW);
        Assertions.assertEquals("Больше сервисов", elementAllServicesWindow.getText());
        driver.navigate().refresh();
    }

    @DisplayName(" корректно кликнуть UserMenuWindow")
    @Test
    public void shouldHaveCorrectClickUserMenuWindow() {
        WebElement userMenuWindow = driver.findElement(USER_MENU_WINDOW);
        userMenuWindow.click();
        WebElement elementUserMenuWindow = driver.findElement(ELEMENT_USER_MENU_WINDOW);
        Assertions.assertEquals("Войти в Яндекс", elementUserMenuWindow.getText());
        driver.navigate().refresh();
    }

    @DisplayName(" корректно кликнуть SearchInputBar")
    @Test
    public void shouldHaveCorrectClickSearchInputBar() {
        WebElement searchInputBar = driver.findElement(SEARCH_INPUT_BAR);
        searchInputBar.click();
        WebElement elementSearchInputBar = driver.findElement(ELEMENT_SEARCH_INPUT_BAR);
        Assertions.assertEquals("найдётся всё", elementSearchInputBar.getAttribute(ATTRIBUTE_PLACEHOLDER));
        driver.navigate().refresh();
    }

    @DisplayName(" корректно кликнуть WeatherHomePage")
    @Test
    public void shouldHaveCorrectClickWeatherHomePage() {
        WebElement weatherHomePage = driver.findElement(WEATHER_HOME_PAGE);
        weatherHomePage.click();
        pageLoad(driver, WEATHER_HOME_PAGE);
        ArrayList<String> weatherTab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(weatherTab.get(1));
        WebElement elementWeatherHomePage = driver.findElement(ELEMENT_WEATHER_HOME_PAGE);
        Assertions.assertEquals("Прогноз на 10 дней", elementWeatherHomePage.getAttribute(ATTRIBUTE_ARIA_LABEL));
        driver.close();
        driver.switchTo().window(originalWindow);
    }

    @DisplayName(" корректно кликнуть TrafficPage")
    @Test
    public void shouldHaveCorrectClickTrafficPage() {
        WebElement trafficPage = driver.findElement(TRAFFIC_PAGE);
        trafficPage.click();
        pageLoad(driver, TRAFFIC_PAGE);
        ArrayList<String> trafficTab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(trafficTab.get(1));
        WebElement elementTrafficPage = driver.findElement(ELEMENT_TRAFFIC_PAGE);
        Assertions.assertEquals("Дорожная ситуация", elementTrafficPage.getText());
        driver.close();
        driver.switchTo().window(originalWindow);
    }

    @DisplayName(" корректно кликнуть UsdMoexPage")
    @Test
    public void shouldHaveCorrectClickUsdMoexPage() {
        WebElement usdMoexPage = driver.findElement(USD_MOEX_PAGE);
        usdMoexPage.click();
        pageLoad(driver, USD_MOEX_PAGE);
        ArrayList<String> usdMoexTab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(usdMoexTab.get(1));
        WebElement elementUsdMoexPage = driver.findElement(ELEMENT_USD_MOEX_PAGE);
        Assertions.assertEquals("USD MOEX", elementUsdMoexPage.getAttribute(ATTRIBUTE_VALUE));
        driver.close();
        driver.switchTo().window(originalWindow);
    }

    @DisplayName(" корректно кликнуть EurMoexPage")
    @Test
    public void shouldHaveCorrectClickEurMoexPage() {
        WebElement eurMoexPage = driver.findElement(EUR_MOEX_PAGE);
        eurMoexPage.click();
        pageLoad(driver, EUR_MOEX_PAGE);
        ArrayList<String> eurMoexTab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(eurMoexTab.get(1));
        WebElement elementEurMoexPage = driver.findElement(ELEMENT_EUR_MOEX_PAGE);
        Assertions.assertEquals("EUR MOEX", elementEurMoexPage.getAttribute(ATTRIBUTE_VALUE));
        driver.close();
        driver.switchTo().window(originalWindow);
    }

    @DisplayName(" корректно кликнуть GeoNomeTab")
    @Test
    public void shouldHaveCorrectClickGeoNomeTab() {
        WebElement geoHomePage = driver.findElement(GEO_HOME_PAGE);
        geoHomePage.click();
        pageLoad(driver, GEO_HOME_PAGE);
        ArrayList<String> geoHomeTab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(geoHomeTab.get(1));
        WebElement elementGeoHomePage = driver.findElement(ELEMENT_GEO_HOME_PAGE);
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
            System.err.println("Element not found!");
            ex.getStackTrace();
        }
    }
}
