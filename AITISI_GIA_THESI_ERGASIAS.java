
package com.mycompany.careerfinder;

import java.sql.Time;
import java.util.Date;


public class AITISI_GIA_THESI_ERGASIAS {    
    private int kwdikos_aitisis;
    private String username_ptyxiouxou;
    private int kwdikos_thesis_ergasias;
    private Date hmeromhnia;
    private Time wra;
    private String katastasi;
    
    
    
    
    public AITISI_GIA_THESI_ERGASIAS (int kwdikos_aitisis, String username_ptyxiouxou, int kwdikos_thesis_ergasias, Date hmeromhnia, Time wra, String katastasi)
   {
       
   this.kwdikos_aitisis = kwdikos_aitisis;
   this.username_ptyxiouxou = username_ptyxiouxou;
   this.kwdikos_thesis_ergasias = kwdikos_thesis_ergasias;
   this.hmeromhnia = hmeromhnia; 
   this.wra = wra;
   this.katastasi = katastasi;
   
   
   } 
            
    public int get_kwdikos_aitisis()
            
    {
        return kwdikos_aitisis;
    }
    
    public void set_kwdikos_aitisis(int kwdikos_aitisis)
            
    {
        this.kwdikos_aitisis = kwdikos_aitisis;
    }   
    
     public String get_username_ptyxiouxou()
            
    {
        return username_ptyxiouxou;
    }
    
    public void set_username_ptyxiouxou(String username_ptyxiouxou)
            
    {
        this.username_ptyxiouxou = username_ptyxiouxou;
    } 
         
    public int get_kwdikos_thesis_ergasias()
            
    {
        return kwdikos_thesis_ergasias;
    }
    
    public void set_kwdikos_thesis_ergasias(int kwdikos_thesis_ergasias)
            
    {
        this.kwdikos_thesis_ergasias = kwdikos_thesis_ergasias;
    }   
    
    
    public Date get_hmeromhnia()
            
    {
        return hmeromhnia;
    }
    
    public void set_hmeromhnia(Date hmeromhnia)
            
    {
        this.hmeromhnia = hmeromhnia;
    }
    
    public Time get_wra()
            
    {
        return wra;
    }
    
    public void set_wra(Time wra)
            
    {
        this.wra = wra;
    } 
    
    
    public String get_katastasi()
            
    {
        return katastasi;
    }
    
    public void set_katastasi(String katastasi)
            
    {
        this.katastasi = katastasi;
    } 

}  

