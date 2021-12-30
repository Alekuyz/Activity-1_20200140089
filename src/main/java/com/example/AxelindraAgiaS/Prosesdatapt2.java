/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.AxelindraAgiaS;

/**
 *
 * @author AXEL
 */
public class Prosesdatapt2 {
    public Double newharga(String harga){
        Double newharga = Double.valueOf(harga);
        return newharga;
    }
    public Double newjumlah(String jumlahkilo){
        Double newjumlah = Double.valueOf(jumlahkilo);
        return newjumlah;
    }
    public Double newjumlahbayar(Double harga, Double jumlah){
        Double jumlahbyr = harga * jumlah;
        return jumlahbyr;
    }
    public Double newtotalbayar(Double jmlhbyr, Double hdisk){
        Double totalbayar = jmlhbyr - hdisk;
        return totalbayar;
    }
    public String diskon(double jmlbyr){
        String dskn = null;
        if(jmlbyr < 16000){
            dskn = "0";
        }else if (jmlbyr < 25000){
            dskn = "10";
        }else{
            dskn = "15";
        }
        return dskn;
    }
    public Double newhargadiskon(Double jmlbyr, Integer disk){
        Double hargadiskon = jmlbyr*disk/100;
        return hargadiskon;
    }
    public void math(Double jumlahbayar, Integer diskon,Double totalbayar,Double hargadiskon){
        if(jumlahbayar < 16000){
            totalbayar = jumlahbayar - (jumlahbayar*diskon/100);
            hargadiskon =jumlahbayar*diskon/100;
            
        }else if(jumlahbayar < 25000){
            diskon = 10;
            totalbayar = jumlahbayar - (jumlahbayar*diskon/100);
            hargadiskon = jumlahbayar*diskon/100;
            
        }else{
            diskon = 15;
            totalbayar = jumlahbayar - (jumlahbayar*diskon/100);
            hargadiskon = jumlahbayar*diskon/100;
        }
    }
}
