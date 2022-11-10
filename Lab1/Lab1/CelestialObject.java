package Lab1;
import java.io.File;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

// Maahir Vohra
// 10/11/22
// To make the Celestial Object class and protect all the attributes
// Professor Sawh
public class CelestialObject {
    //attributes
    private double diameter;
    private int temperature;
    private String name;

    //symbolic constants
    private final double MIN_DIAMETER = 1;
    private final int MIN_TEMP = 300;
    private final String MIN_NAME = "N/A";

    
    //default constructor. No input, outputs the attribute's minimum value
    public CelestialObject(){
        diameter = MIN_DIAMETER;
        temperature = MIN_TEMP;
        name = "N/A";
    }
    
    //another overloaded constructor
    public CelestialObject(String n, double d, int t){
        setName(n);
        setDiameter(d);
        setTemperature(t);
    }
    
    public CelestialObject(String s) throws IOException, FileNotFoundException {
        File m = new File(s);
        Scanner in = new Scanner(m);
        
        String nameF;
        double diameterF;
        int temperatureF;
        
        while(in.hasNext()) {
            nameF = in.nextLine();
            in.nextLine();
            diameterF = in.nextDouble();
            temperatureF = in.nextInt();
            
            nameF = name;
            diameterF = diameter;
            temperatureF = temperature;
        }
        //m.close();
        
    }
    //setter for diameter. Input diameter, no output
    public void setDiameter(double d){
        if (d >= MIN_DIAMETER){
            diameter = d;
        }
        else{
            diameter = MIN_DIAMETER;
        }
         
    }
    
    //getter for diameter. No input, output diameter
    public double getDiameter(){
        return diameter;
    }
    
    //setter for temp. Input temperature, no output
    public void setTemperature(int t){
        if (t >= MIN_TEMP){
            temperature = t;
        }
        else{
            temperature = MIN_TEMP;
        }
    }
    
    //getter for temp. No input, output temperature
    public int getTemperature(){
        return temperature;
    }
    
    //setter for name. Input name, no output
    public void setName(String n){
        if (n == null || n.trim().equals("")) {                  // n.trim().equals("")  // n == null || n.length() == 0
            name = MIN_NAME;
        }
        else{
            name = name;
        }
    }
    
    //getter for name. No input, output name
    public String getName(){
        return name;
    }
    
    public String toString(){
        return "A celestial object, named " + name + ", with a diameter of " + diameter + " miles and a temperature of " + Math.round(temperature) + " Kelvin.";
        
    }
    
}
