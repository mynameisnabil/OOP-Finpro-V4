package model;

public class Transaksi
<A, B, C, D, E, F> {
    A namaCustomer;
    B merek;
    C namaMobil;
    D price;
    E amount;
    F quantity;


    public Transaksi(A namaCustomer, B merek, C namaMobil, D price, E amount, F quantity) {
        this.namaCustomer = namaCustomer;
        this.merek = merek;
        this.namaMobil = namaMobil;
        this.price = price;
        this.amount = amount;
        this.quantity = quantity;
    }

    //getter
    public A getNamaCustomer() {
        return namaCustomer;
    }

    public B getmerek() {
        return merek;

    }

    public C getNamaMobil() {
        return namaMobil;
    }

    public D getPrice() {
        return price;
    }

    public E getAmount() {
        return amount;
    }

    public F getQuantity() {
        return quantity;
    }


}
