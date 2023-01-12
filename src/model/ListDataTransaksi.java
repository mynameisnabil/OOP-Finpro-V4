package model;

import java.util.ArrayList;

public class ListDataTransaksi {
    private static ArrayList<Transaksi<String, String, String, Integer, Integer, Integer>> list = new ArrayList<Transaksi<String, String, String, Integer, Integer, Integer>>();

    public ListDataTransaksi(){

    }

    public static void addTrans(String namaCustomer, String merek, String namaMobil, int price, int amount, int quantity){
        list.add(new Transaksi<String, String, String, Integer, Integer, Integer>(namaCustomer, merek, namaMobil, price, amount , quantity));
    }

    //getter 
    public static String getNamaCustomer(int index){
        return list.get(index).getNamaCustomer();
    }

    public static String getMerek(int index){
        return list.get(index).getmerek();
    }

    public static String getNamaMobil(int index){
        return list.get(index).getNamaMobil();
    }

    public static int getPrice(int index){
        return list.get(index).getPrice();
    }

    public static int getAmount(int index){
        return list.get(index).getAmount();
    }

    public static int  getQuantity(int index){
        return list.get(index).getQuantity();
    }

    //show transaksi
    public static void showTransaksi() {
        System.out.println("Nama Customer\tMerek\tNama Mobil\tPrice\tAmount\tQuantity");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(getNamaCustomer(i) + "\t" + getMerek(i) + "\t" + getNamaMobil(i) + "\t" + getPrice(i) + "\t" + getAmount(i) + "\t" + getQuantity(i));
        }
    }
}