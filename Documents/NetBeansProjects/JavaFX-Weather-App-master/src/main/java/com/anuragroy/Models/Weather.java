// weather object class with related variables and associated setters and getters
package com.anuragroy.Models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Weather {
    private String cloudDescription;
    private double temp;
    private double humidity;
    private double maxTemp;
    private double minTemp;
    private double wind;
    private Date date;
    private String icon;
    
    private final SimpleDateFormat sdf;
    
    
    //constructor sets the format for the date variable
    public Weather(){
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        
    }

   
    public void setCloudDescription(String cloudDescription){
        this.cloudDescription = cloudDescription;
    }
    public String getCloudDescription() { 
        return this.cloudDescription; 
    }

    public void setTemp(double temp){
        this.temp= temp;
    }
    public double getTemp() {
        return this.temp; 
    }

    public void setMaxTemp(double maxTemp){
        this.maxTemp=maxTemp;
    }
    public double getMaxTemp() {
        return this.maxTemp;  
    }

    public void setMinTemp(double minTemp){
        this.minTemp = minTemp;
    }
    public double getMinTemp() {
        return this.minTemp; 
    }

    public void setHumidity(double humidity){
        this.humidity= humidity;
    }
    public double getHumidity() {
        return this.humidity; 
    }

    public void setDate(String date) throws ParseException{
        this.date = sdf.parse(date);
    }
    public String getDate() {
        return this.date.toString(); 
    }
    public Date getDateAsDate() { 
        return this.date; 
    }
    
    public Date getDateWithoutTime() throws ParseException 
        { 
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            return formatter.parse(formatter.format(this.date)); 
        }
    
    public void setWind(double wind){
        this.wind=wind;
    }
    public double getWind() {
        return this.wind;  
    }

    public void setIcon(String icon){
        this.icon=icon;
    }
    public String getIcon() {
        return this.icon;  
    }
    
    
    @Override
    public String toString() {
        return ("Date: " + date + "\nTemperature: " + temp + "\nMaximum Temperature: " + maxTemp + "\nMinimum"
                + " Temperature: " + minTemp + "\nHumidity: " + humidity + "\n" + cloudDescription);
    }
    
    

    
}
