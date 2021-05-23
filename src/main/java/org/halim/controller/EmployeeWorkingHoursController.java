/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.halim.controller;

import java.sql.ResultSet;
import org.halim.DAO.EmployeeWorkingHoursDAO;
import org.halim.Model.Employee;

/**
 *
 * @author ABDELHALIM
 */
public class EmployeeWorkingHoursController {

    public boolean submitWorkingHours(Employee employeeDetails) {
        return new EmployeeWorkingHoursDAO().insertWorkingDay(employeeDetails);
    }

    public ResultSet getEmployeeHistory(int employeeID) {
        return new EmployeeWorkingHoursDAO().getEmployeeHistory(employeeID);
    }
    
}
