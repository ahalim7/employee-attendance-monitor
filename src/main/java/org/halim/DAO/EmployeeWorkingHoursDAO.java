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
import org.halim.Model.Employee;

/**
 *
 * @author ABDELHALIM
 */
public class EmployeeWorkingHoursDAO {

    public boolean insertWorkingDay(Employee employeeWorkingDay) {

        Connection connection = new DBConnector().connect();
        try {
            CallableStatement callableStatement = connection.prepareCall("{CALL SP_INSERT_WORKING_HOURS (?,?,?,?,?,?,?)}");
            callableStatement.setString(1, employeeWorkingDay.getDate());
            callableStatement.setString(2, employeeWorkingDay.getArrivalTime());
            callableStatement.setString(3, employeeWorkingDay.getDepatureTime());
            callableStatement.setInt(4, employeeWorkingDay.getHours());
            callableStatement.setInt(5, employeeWorkingDay.getMinutes());
            callableStatement.setInt(6, employeeWorkingDay.getSeconds());
            callableStatement.setInt(7, employeeWorkingDay.getEmployeeID());
            return callableStatement.execute();
        } catch (SQLException sexp) {
            sexp.printStackTrace();
        }
        return false;
    }

    public ResultSet getEmployeeHistory(int employeeID) {

        Connection connection = new DBConnector().connect();
        try {
            CallableStatement callableStatement = connection.prepareCall("{CALL SP_GET_EMPLOYEE_WORKING_HOURS_HISTORY (?)}");
            callableStatement.setInt(1, employeeID);
            return callableStatement.executeQuery();
        } catch (SQLException sexp) {
            sexp.printStackTrace();
        }
        return null;
    }
}
