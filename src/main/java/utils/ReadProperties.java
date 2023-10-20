package utils;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

    public ReadProperties() {
    }

    public static void ConfigFileReader() {
        String propertyFilePath = System.getProperty("user.dir") + "/test config/config.properties";

        Properties properties;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();

            try {
                properties.load(reader);
                reader.close();
            } catch (IOException var4) {
                var4.printStackTrace();
            }
        } catch (FileNotFoundException var5) {
            var5.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }

        DriverSetup.invokeBrowsers(properties.getProperty("browserName"), properties.getProperty("WebsiteURL"));
    }
}
