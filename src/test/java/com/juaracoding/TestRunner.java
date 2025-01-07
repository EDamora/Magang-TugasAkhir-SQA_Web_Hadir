package com.juaracoding;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//
@CucumberOptions(features = {
//        "src/main/resources/features/01IzinPulangCepat.feature"},
//        "src/main/resources/features/02AbsenPoint.feature",
//        "src/main/resources/features/03ClientUpliner.feature",
//        "src/main/resources/features/04Divisi.feature"},
        "src/main/resources/features/05Jabatan.feature"},
        glue = "com.juaracoding",
        plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json"})
public class TestRunner extends AbstractTestNGCucumberTests {
}