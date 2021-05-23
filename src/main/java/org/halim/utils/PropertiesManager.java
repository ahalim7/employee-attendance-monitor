/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.halim.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ABDELHALIM
 */
public class PropertiesManager {

    Properties properties;

    public PropertiesManager() {
        properties = new Properties();
        loadProperties();
    }

    private void loadProperties() {

        try (InputStream inputStream = new FileInputStream(new File("resources/configuration/config"))) {
            properties.load(inputStream);
            inputStream.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PropertiesManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PropertiesManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getProperty(String key){
        return properties.getProperty(key);
    }
}
