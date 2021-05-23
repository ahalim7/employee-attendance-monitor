/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.halim.Model;

/**
 *
 * @author ABDELHALIM
 */
public class Employee {

    private int employeeID;
    private String date;
    private int hours;
    private int minutes;
    private int seconds;
    private String arrivalTime;
    private String depatureTime;

    public Employee(int employeeID, String date, int hours, int minutes, int seconds, String arrivalTime, String depatureTime) {
        this.employeeID = employeeID;
        this.date = date;
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.arrivalTime = arrivalTime;
        this.depatureTime = depatureTime;
    }

    /**
     * @return the employeeID
     */
    public int getEmployeeID() {
        return employeeID;
    }

    /**
     * @param employeeID the employeeID to set
     */
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the hours
     */
    public int getHours() {
        return hours;
    }

    /**
     * @param hours the hours to set
     */
    public void setHours(int hours) {
        this.hours = hours;
    }

    /**
     * @return the minutes
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * @param minutes the minutes to set
     */
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    /**
     * @return the seconds
     */
    public int getSeconds() {
        return seconds;
    }

    /**
     * @param seconds the seconds to set
     */
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    /**
     * @return the arrivalTime
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * @param arrivalTime the arrivalTime to set
     */
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /**
     * @return the depatureTime
     */
    public String getDepatureTime() {
        return depatureTime;
    }

    /**
     * @param depatureTime the depatureTime to set
     */
    public void setDepatureTime(String depatureTime) {
        this.depatureTime = depatureTime;
    }
}
