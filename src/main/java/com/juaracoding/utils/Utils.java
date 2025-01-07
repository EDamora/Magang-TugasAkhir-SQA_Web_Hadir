package com.juaracoding.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Utils {

    // Mengatur delay untuk test automation
    public static void delay(long detik) {
        try {
            Thread.sleep(detik * 1000); // Mengubah detik menjadi milidetik
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Memulihkan status interrupt
            throw new RuntimeException("Delay interrupted: " + e.getMessage(), e);
        }
    }

    // Counter untuk test
    public static int testCount = 0;

    // Mengambil screenshot
    public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
        // Format nama file screenshot
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new java.util.Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        // Path tujuan
        String pathDestination = System.getProperty("user.dir") + "/FailedTestScreenshot/"
                + screenshotName + "_" + dateName + ".png";

        // Pastikan direktori ada
        File destination = new File(pathDestination);
        if (!destination.getParentFile().exists()) {
            destination.getParentFile().mkdirs();
        }

        // Salin file
        FileUtils.copyFile(source, destination);
        return pathDestination;
    }

    // Menangani alert pop-up
    public static void handleAlert(WebDriver driver, String expectedAlertText) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 30);  // Untuk Selenium 3, gunakan long untuk waktu tunggu
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());

            // Verifikasi teks alert
            String alertText = alert.getText();
            if (alertText.equals(expectedAlertText)) {
                alert.accept();
                System.out.println("Alert accepted with text: " + alertText);
            } else {
                alert.dismiss();
                System.out.println("Alert dismissed. Expected: " + expectedAlertText + " but found: " + alertText);
            }
        } catch (TimeoutException e) {
            System.out.println("No alert appeared within the wait time: " + e.getMessage());
        } catch (NoAlertPresentException e) {
            System.out.println("No alert present: " + e.getMessage());
        }
    }

    // Tunggu hingga elemen dapat diklik dan klik elemen
    public static void waitAndClick(WebDriver driver, WebElement buttonElement) {
        if (driver == null || buttonElement == null) {
            throw new IllegalArgumentException("Driver atau element tidak boleh null");
        }
        try {
            WebDriverWait wait = new WebDriverWait(driver, 30);  // Gunakan long untuk waktu tunggu
            WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(buttonElement));
            clickableButton.click();
            System.out.println("Tombol berhasil diklik!");
        } catch (TimeoutException e) {
            System.out.println("Elemen tidak dapat diklik dalam batas waktu: " + e.getMessage());
            throw new RuntimeException("Gagal menemukan elemen untuk diklik", e);
        } catch (Exception e) {
            System.out.println("Gagal mengklik tombol: " + e.getMessage());
            throw new RuntimeException("Gagal mengklik tombol", e);
        }
    }
}
