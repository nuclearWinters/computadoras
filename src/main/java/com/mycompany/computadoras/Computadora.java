/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.computadoras;

/**
 *
 * @author Armando
 */
public class Computadora {
    public String tipoCompu = "";
    public String firstCost = "";
    public String fuelUsed = ""; 
    public String maxRevolutionsPerMinute = ""; 
    public String maxTemperature = ""; 
    public String powerOutput = ""; 
    public String volts = "";
    
    public void setfFirstCost  () {
        this.firstCost = "First Cost";
    }
    
    public void setFuelUsed  () {
        this.fuelUsed = "Fuel Used";
    }
    
    public void setMaxRevolutionsPerMinute  () {
        this.maxRevolutionsPerMinute = "Max Revolutions Per Minute";
    }
    
    public void setMaxTemperature  () {
        this.maxTemperature = "Max Temperature";
    }
    
    public void setPowerOutput  () {
        this.powerOutput = "Power Output";
    }
    
    public void setVolts  () {
        this.volts = "Volts";
    }
    
    public void setfTipoCompu (String nombre) {
        this.tipoCompu = nombre;
    }
    
    public void Describir () {
        System.out.println("Esta computadora " + tipoCompu + " cuenta con: " + (firstCost != "" ? (firstCost + ", ") : "") + (fuelUsed != "" ? (fuelUsed + ", ") : "") + (maxRevolutionsPerMinute != "" ? (maxRevolutionsPerMinute + ", ") : "") + (maxTemperature != "" ? (maxTemperature + ", ") : "") + (powerOutput != "" ? (powerOutput + ", ") : "") + (volts != "" ? (volts) : ""));
    }
}
