package model;

public class Transaksi
<A, B, C, D, E> {
    A namaCustomer;
    B namaMobil;
    C Merek;
    D type;
    E Price;


    public Transaksi(A namaCustomer, B namaMobil, C Merek, D type, E Price) {
        this.namaCustomer = namaCustomer;
        this.namaMobil = namaMobil;
        this.Merek = Merek;
        this.type = type;
        this.Price = Price;
    }

    //getter
    public A getNamaCustomer() {
        return namaCustomer;
    }

    public void setNamaCustomer(A namaCustomer){
        this.namaCustomer = namaCustomer;
    }

    public B getnamaMobil() {
        return namaMobil;
    }

    public void setnamaMobil(B namaMobil){
        this.namaMobil = namaMobil;
    }

    public C getMerek() {
        return Merek;
    }

    public void setMerek(C Merek){
        this.Merek = Merek;
    }

    public D gettype() {
        return type;
    }

    public void settype(D type){
        this.type = type;
    }

    public E getprice() {
        return Price;
    }

    public void setprice(E price){
        this.Price = Price;
    }



}