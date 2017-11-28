/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

/**
 *
 * @author shols
 */
public class HourlyEmployee extends Employee {
    private double wageRate;
    private double hours;

    public HourlyEmployee(String name, String ssn, double wageRate, double hours) {
        super(name, ssn);
        this.wageRate = wageRate;
        this.hours = hours;
    }

    public double getWageRate() {
        return wageRate;
    }

    public double getHours() {
        return hours;
    }

    public void setWageRate(double wageRate) {
        this.wageRate = wageRate;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double getNetPay(){
        return hours * wageRate;
    }
    
    @Override
    public void printWeeklyCheck(){
        double temp = hours * wageRate;
        System.out.println(temp);
    }
}
