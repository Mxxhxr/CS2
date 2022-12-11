package Lab3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import Lab3.CarException;

public class Utilities {

    public int ReadData(String fileName, Car[] carList) throws CarException{

        String line = null;

        int arrCounter = 0;
        try {
            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int i = -1;
            String vin = "";
            int year = 0;
            double price = 0;
            String make = "";
            while((line = bufferedReader.readLine()) != null) {

                i++;
                if (i == 0) vin = line;
                else if (i == 1) year = Integer.parseInt(line);
                else if (i == 2) price = Double.parseDouble(line);
                else if (i == 3){
                    make = line;

                    Car newCar = new Car(year,price,make,vin);
                    carList[arrCounter] = newCar;
                    vin = "";
                    year = 0;
                    price = 0;
                    make = "";
                    arrCounter++;
                    i = 0;
                }
            }

            bufferedReader.close();
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }
        return arrCounter;
    }
    
    public static void PrintData(Car[] CarList, Integer limit){
        for (int i = 0; i<limit; i++) {
            System.out.println(CarList[i]);
        }
    }

    public static void main(String[] args) throws CarException {
        Car[] carList = new Car[20];
        System.out.println(ReadData("yo.txt",carList));
        PrintData(carList, 2);
    }
}
