package ru.buttonone;

import org.openqa.selenium.By;

public class XpathConstants {
    public static final By HEAD_LINE_LOGO = By.xpath("//div[@class='headline']/a");
    public static final By ENTER_HOME = By.xpath("//a[contains(@class, 'enter home')]");
    public static final By ELEMENT_ENTER_HOME_PAGE = By.xpath("//h1/span");
    public static final By ALL_SERVICES_WINDOW = By.xpath("//a[contains(@class, 'pinned__all')]");
    public static final By ELEMENT_ALL_SERVICES_WINDOW = By.xpath("//a[contains(@class, 'all services')]");
    public static final By USER_MENU_WINDOW = By.xpath("//a[contains(@class, 'menu usermenu')]");
    public static final By ELEMENT_USER_MENU_WINDOW = By.xpath("//a[contains(@class, 'login-button')]");
    public static final By SEARCH_INPUT_BAR = By.xpath("//input[contains(@class, 'input')]");
    public static final By ELEMENT_SEARCH_INPUT_BAR = By.xpath("//input[contains(@class, 'input')]");
    public static final By WEATHER_HOME_PAGE = By.xpath("//a[contains(@class, 'weather home')]");
    public static final By ELEMENT_WEATHER_HOME_PAGE = By.xpath("//a[contains(@class, 'active_yes ')]");
    public static final By TRAFFIC_PAGE = By.xpath("//a[@data-statlog='informers.traffic']");
    public static final By ELEMENT_TRAFFIC_PAGE = By.xpath("//div[contains(@class, 'view__text')]");
    public static final By USD_MOEX_PAGE = By.xpath("//a[contains(@class, 'stocks-item') and @title='USD MOEX']");
    public static final By ELEMENT_USD_MOEX_PAGE = By.xpath("//input[@id]");
    public static final By EUR_MOEX_PAGE = By.xpath("//a[contains(@class, 'stocks-item') and @title='EUR MOEX']");
    public static final By ELEMENT_EUR_MOEX_PAGE = By.xpath("//input[@id]");
    public static final By GEO_HOME_PAGE = By.xpath("//a[contains(@class, 'geo home')]/span");
    public static final By ELEMENT_GEO_HOME_PAGE = By.xpath("//a[contains(@class, 'active link')]");
}
