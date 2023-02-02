package model;

import java.util.ArrayList;

public class ListData {
    private static ArrayList<LuxuryCar> Cars = new ArrayList<LuxuryCar>();

    public static void addCar(String namaMobil, String merek, String Type, int stock, int price) {
        LuxuryCar car = new LuxuryCar(namaMobil, merek, stock, price);
        Cars.add(car);

    }

    public ArrayList<LuxuryCar> getSedans() {
        return Cars;
    }

    //get size
    public static int getSize() {
        return Cars.size();
    }

    public static String getNamaMobil(int index) {
        return Cars.get(index).getNamaMobil();
    }

    public static String getMerek(int index) {
        return Cars.get(index).getMerek();
    }

    public static String getType(int index) {
        return Cars.get(index).getType();
    }
    
    public static int getStock(int index) {
        return Cars.get(index).getStock();
    }

    public static int getPrice(int index) {
        return Cars.get(index).getPrice();
    }


    //setter
    public static void setNamaMobil(int index, String namaMobil) {
        Cars.get(index).setNamaMobil(namaMobil);
    }

    public static void setMerek(int index, String merek) {
        Cars.get(index).setMerek(merek);
    }

    public static void setStock(int index, int stock) {
        Cars.get(index).setStock(stock);
    }

    public static void setPrice(int index, int price) {
        Cars.get(index).setPrice(price);
    }

    public static void setType(int index, String Type) {
        Cars.get(index).setType(Type);
    }


    //delete

    public static void deleteCar(int index) {
        Cars.remove(index);
    }
    
}