package model;

public class Car<T> {

    private String namaMobil;
    private String merek;
    private T Type;
    private int stock;
    private int price;

    public Car(String namaMobil, String merek, T Type, int stock, int price) {
        this.namaMobil = namaMobil;
        this.merek = merek;
        this.Type = Type;
        this.stock = stock;
        this.price = price;
    }

    public String getNamaMobil() {
        return namaMobil;
    }

    public void setNamaMobil(String namaMobil) {
        this.namaMobil = namaMobil;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public T getType() {
        return Type;
    }

    public void setType(T Type) {
        this.Type = Type;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
