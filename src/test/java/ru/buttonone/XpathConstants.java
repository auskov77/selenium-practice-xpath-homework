package ru.buttonone;

import org.openqa.selenium.By;

public enum XpathConstants {
    ;
    public static final By ELEMENT_1_XPATH = By.xpath("//div[@class='headline']/a");
    public static final By ELEMENT_2_XPATH = By.xpath("//a[contains(@class, 'enter home')]");
    public static final By ELEMENT_2_XPATH_HOME_PAGE = By.xpath("//h1/span");
    public static final By ELEMENT_3_XPATH = By.xpath("//a[contains(@class, 'pinned__all')]");
    public static final By ELEMENT_3_XPATH_ALL_SERVICES = By.xpath("//a[contains(@class, 'all services')]");
    public static final By ELEMENT_4_XPATH = By.xpath("//a[contains(@class, 'menu usermenu')]");
    public static final By ELEMENT_4_XPATH_USER_MENU_WINDOW = By.xpath("//a[contains(@class, 'login-button')]");
    public static final By ELEMENT_5_XPATH = By.xpath("//input[contains(@class, 'input')]");
    public static final By ELEMENT_5_XPATH_SEARCH_INPUT_BAR = By.xpath("//input[contains(@class, 'input')]");
    public static final By ELEMENT_6_XPATH = By.xpath("//a[contains(@class, 'weather home')]");
    public static final By ELEMENT_6_XPATH_WEATHER_HOME_PAGE = By.xpath("//a[contains(@class, 'active_yes ')]");
    public static final By ELEMENT_7_XPATH = By.xpath("//a[contains(@class, 'traffic')]");
    public static final By ELEMENT_7_XPATH_TRAFFIC_PAGE = By.xpath("//div[contains(@class, 'view__text')]");
    public static final By ELEMENT_8_XPATH = By.xpath("//a[@title='USD MOEX']");
    public static final By ELEMENT_8_XPATH_USD_MOEX_PAGE = By.xpath("//div[contains(@class, 'entity-search__title')]");
    public static final By ELEMENT_9_XPATH = By.xpath("//a[@title='EUR MOEX']");
    public static final By ELEMENT_9_XPATH_EUR_MOEX_PAGE = By.xpath("//input[@id]");
    public static final By ELEMENT_10_XPATH = By.xpath("//a[contains(@class, 'geo home')]/span");
    public static final By ELEMENT_10_XPATH_GEO_HOME_PAGE = By.xpath("//a[contains(@class, 'active link')]");

}
