/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.AxelindraAgiaS;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author AXEL
 */
@Controller

public class Prosesdata {
    
    
    @RequestMapping("/prosesinput")
    public String inputanuser(HttpServletRequest data, Model buah){
        Prosesdatapt2 pdata2 = new Prosesdatapt2();
        //getting data
        String namabuah = data.getParameter("var_namabuah");
        String hargabuah = data.getParameter("var_hargakilo");
        String jumlahbuah = data.getParameter("var_jumlahbeli");
        //import data from process to variabel
        
        Double convharga        = pdata2.newharga(hargabuah);
        Double convjumlah       = pdata2.newjumlah(jumlahbuah);
        Double jumlahbayar      = pdata2.newjumlahbayar(convharga, convjumlah);
        String diskonpersen     = pdata2.diskon(jumlahbayar);
        Double hargadiskon      = pdata2.newhargadiskon(jumlahbayar, Integer.valueOf(diskonpersen));
        Double totalbayar       = pdata2.newtotalbayar(jumlahbayar, hargadiskon);
        pdata2.math(jumlahbayar, Integer.SIZE, totalbayar, hargadiskon);
        //
        buah.addAttribute("name", namabuah);
        buah.addAttribute("price", hargabuah);
        buah.addAttribute("kilo", jumlahbuah);
        buah.addAttribute("tbayar", totalbayar);
        buah.addAttribute("discountrp", hargadiskon);
        buah.addAttribute("disc", diskonpersen);
        buah.addAttribute("total0", jumlahbayar);
        return "Axelindraagia";
    }  
    
}
