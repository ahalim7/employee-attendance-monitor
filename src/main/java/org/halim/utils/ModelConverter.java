/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.halim.utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ABDELHALIM
 */
public class ModelConverter {

    public DefaultTableModel formatDate(ResultSet records, DefaultTableModel tableModel) {
        try {
            java.sql.ResultSetMetaData rsmd = records.getMetaData();
            int columnCount = rsmd.getColumnCount();

            while (records.next()) {
                Object[] objects = new Object[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    objects[i] = records.getObject(i + 1);
                }
                tableModel.addRow(objects);
            }
        } catch (SQLException sexp) {
            sexp.printStackTrace();
        }
        return tableModel;
    }
}
