package Lab3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import Lab3.CarException;
import java.util.Scanner;
import java.io.FileWriter;

public class Utilities {

    public static int ReadData(String fileName, Car[] carList) throws CarException{

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
                    i = -1;
                }
            }

            bufferedReader.close();
        }
        catch(IOException ex) {
            throw new CarException("error reading file");
        }
        return arrCounter;
    }
    
    public static void PrintData(Car[] CarList, Integer limit){
        for (int i = 0; i<limit; i++) {
            System.out.println(CarList[i]);
        }
    }

    public static void WriteData(Car[] carList, Integer limit, String fileName) throws CarException {

        try {
            File file = new File(fileName);
            PrintWriter writer;
            if (!file.exists() || !file.isFile()){
                // file.createNewFile();
                writer = new PrintWriter(fileName);
            }else{
                writer = new PrintWriter(file);
            }
            for (int i = 0; i<limit; i++){
                writer.println(carList[i].getVin());
                writer.println(carList[i].getYear());
                writer.println(carList[i].getPrice());
                writer.println(carList[i].getMake());
            }
            System.out.println("Wrote File: "+fileName);
            writer.close();
        } catch (Exception e) {
            throw new CarException("error writing file");
        }
    }

    public static void main(String[] args) throws CarException {
        // Car[] carList = new Car[2];
        // System.out.println(ReadData("yo.txt",carList));
        // PrintData(carList, 2);
        // WriteData(carList, 1, "write.txt");

        Car[] carList2 = new Car[10];

        Scanner bot = new Scanner(System.in);
        System.out.println("Enter an input data file:");
        String inputFile = bot.nextLine();
        
        int count = 0;
        count += ReadData(inputFile, carList2);

        
        int option = 0;
        while(true){
            
            System.out.println("\n1. Show cars\n2. Add car\n3. Exit\nEnter option:");
            option = bot.nextInt();

            if(option == 1){
                PrintData(carList2, count);
            }
            else if(option == 2) {
                if(count == carList2.length){
                    throw new CarException("Cannot add a new Car. The array is full.");
                }
                System.out.println("Enter new car details: ");
                System.out.println("Enter Year: ");
                int year = bot.nextInt();
                System.out.println("Enter Price: ");
                double price = bot.nextDouble();
                bot.nextLine();
                System.out.println("Enter Make: ");
                String make = bot.nextLine();
                System.out.println("Enter Vin: ");
                String vin = bot.nextLine();
                Car newCar = new Car(year,price,make,vin);
                carList2[count] = newCar;
                count++;
            }else if(option == 3){
                bot.nextLine();
                System.out.println("Enter a file name to write car data:");
                String fileName = bot.nextLine();
                WriteData(carList2, count, fileName);
                break;
            }else{
                System.out.println("Invalid option");
            }

        }
        
    }
}
