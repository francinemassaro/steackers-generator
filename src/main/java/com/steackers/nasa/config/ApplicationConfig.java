package com.steackers.nasa.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ApplicationConfig {

    public static Properties getProp() throws IOException {
        Properties props = new Properties();
        FileInputStream file = new FileInputStream("../properties/key.properties");
        props.load(file);
        return props;
    }

    // testing if the variable has the key
/*    public static void main(String[] args) throws IOException {
        String key;

        Properties prop = getProp();

        key = prop.getProperty("prop.nasa.key");

        System.out.println(key);
    }*/

}
