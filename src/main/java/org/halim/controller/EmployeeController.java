/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.halim.controller;

import org.halim.DAO.EmployeeDAO;

/**
 *
 * @author ABDELHALIM
 */
public class EmployeeController {

    public String getEmployeeName(int employeeID){
        return new EmployeeDAO().getEmployeeName(employeeID);
    }
    
    public boolean checkForEmployeeExistance(int employeeID) {
        return new EmployeeDAO().checkForEmployeeExistance(employeeID);
    }
}
