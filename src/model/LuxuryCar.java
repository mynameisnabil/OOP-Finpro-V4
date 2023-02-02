package model;
public class LuxuryCar extends Car<String>{

    public LuxuryCar(String namaMobil, String merek, int stock, int price) {
        super(namaMobil, merek, "Luxury Car", stock, price);
    }
    
}
