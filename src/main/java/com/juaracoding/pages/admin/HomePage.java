package com.juaracoding.pages.admin;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    public HomePage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='app_logo']")
    private WebElement txtAppLogo;

    @FindBy(xpath = "//p[normalize-space()='Laporan']")
    private WebElement sideBarLaporan;

    @FindBy(xpath = "//div[contains(@class, 'sidebar__item')]//p[text()='Management']")
    private WebElement sideBarManagement;

    @FindBy(xpath = "//p[.='Divisi']")
    private WebElement sidebarDivisi;

    @FindBy(xpath = "//p[normalize-space()='Izin Pulang Cepat']")
    private WebElement sideBarIzinPulangCepat;

    @FindBy(xpath = "//p[text()='Jabatan']")
    private WebElement sideBarJabatan;

    @FindBy(xpath ="//button[@aria-label='menu']")
    private WebElement btnMenuAdmin;

    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    private WebElement logoutBtn;

    // Assertion
    public String getTxtAppLogo() {
        return txtAppLogo.getText();
    }

    public void setIzinPulangCepat() {
        sideBarLaporan.click();
        sideBarIzinPulangCepat.click();
    }

    public void setDivisi(){
        sideBarManagement.click();
        sidebarDivisi.click();
    }

    public void setJabatan() {
        sideBarManagement.click();
        sideBarJabatan.click();
    }
}