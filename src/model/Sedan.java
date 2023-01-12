package model;
public class Sedan extends Car<String>{

    public Sedan(String namaMobil, String merek, int stock, int price) {
        super(namaMobil, merek, "Sedan", stock, price);
    }
    
}
