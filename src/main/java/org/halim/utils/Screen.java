/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.halim.utils;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author ABDELHALIM
 */
public class Screen {

    public static int getScreenWidth(double percentage) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        return (int) ((screenSize.getWidth() * percentage) / 100);
    }

    public static int getScreenHeight(double percentage) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        return (int) ((screenSize.getHeight() * percentage) / 100);
    }
}
