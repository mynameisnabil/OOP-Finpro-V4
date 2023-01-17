package model;

import java.util.ArrayList;

public class ListDataTransaksi {
    private static ArrayList<Transaksi<String, String, String, String, Integer>> list = new ArrayList<Transaksi<String, String, String, String, Integer>>();

    public ListDataTransaksi(){

    }

    public static void addTrans(String namaCustomer, String namaMobil, String Merek, String type, int price){
        list.add(new Transaksi<String, String, String, String, Integer>(namaCustomer, namaMobil, Merek, type, price));
    }

    //getter
    
    public static int getsize(){
        return list.size();
    }
    
    public static String getNamaCustomer(int index){
        return list.get(index).getNamaCustomer();
    }

    public static String getNamaMobil(int index){
        return list.get(index).getnamaMobil();
    }

    public static String getMerek(int index){
        return list.get(index).getMerek();
    }

    public static String getType(int index){
        return list.get(index).gettype();
    }

    public static Integer getPrice(int index){
        return list.get(index).getprice();
    }


    //setter
    public static void setNamaCustomer(int index, String namaCustomer){
        list.get(index).setNamaCustomer(namaCustomer);
    }

    public static void setNamaMobil(int index, String namaMobil){
        list.get(index).setnamaMobil(namaMobil);
    }

    public static void setMerek(int index, String merek){
        list.get(index).setMerek(merek);
    }

    public static void setType(int index, String type){
        list.get(index).settype(type);
    }

    public static void setprice(int index, int price){
        list.get(index).setprice(price);
    }

    public static void deletedata(int index){
        list.remove(index);
    }


}