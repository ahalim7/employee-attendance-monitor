/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.halim.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.halim.defines.Defines;

/**
 *
 * @author ABDELHALIM
 */
public class EmployeeDAO {

    public String getEmployeeName(int employeeID) {
        Connection connection = new DBConnector().connect();
        try {
            CallableStatement callableStatement = connection.prepareCall("{CALL SP_GET_EMPLOYEE_NAME (?)}");
            callableStatement.setInt(1, employeeID);
            ResultSet result = callableStatement.executeQuery();
            if (result.next()) {
                return result.getString(Defines.EMPLOYEE_COLUMN_NAME);
            }
        } catch (SQLException sexp) {
            sexp.printStackTrace();
        }
        return "";
    }

    public boolean checkForEmployeeExistance(int employeeID) {
        Connection connection = new DBConnector().connect();
        try {
            CallableStatement callableStatement = connection.prepareCall("{CALL SP_CHECK_FOR_EMPLOYEE_EXISTANCE (?)}");
            callableStatement.setInt(1, employeeID);
            ResultSet result = callableStatement.executeQuery();
            if (result.next()) {
                return true;
            }
        } catch (SQLException sexp) {
            sexp.printStackTrace();
        }
        return false;
    }

}
