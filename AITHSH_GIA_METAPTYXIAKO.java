package com.mycompany.careerfinder;


import java.sql.Time;
import java.util.Date;


public class AITHSH_GIA_METAPTYXIAKO {
    
        private int kodikos_aithshs;
        private String username_ptixiouxou;
        private int kodikos_metaptixiakou_programmatos;
	private Date imerominia;
	private Time wra;
        private String katastasi;
	
	
    public AITHSH_GIA_METAPTYXIAKO(int kodikos_aithshs, String username_ptixiouxou, int kodikos_metaptixiakou_programmatos, Date imerominia, Time wra, String katastasi)
            
    {
        this.kodikos_aithshs = kodikos_aithshs;
        this.username_ptixiouxou = username_ptixiouxou;
        this.kodikos_metaptixiakou_programmatos = kodikos_metaptixiakou_programmatos;
        this.imerominia = imerominia;
	this.wra = wra;
        this.katastasi = katastasi;
        
    }
    
    public int get_kodikos_aithshs()
            
    {
        return kodikos_aithshs;
    }
    
    public void set_kodikos_aithshs(int kodikos_aithshs)
            
    {
        this.kodikos_aithshs = kodikos_aithshs;
    }
    
    public String get_username_ptixiouxou()
            
    {
        
        return username_ptixiouxou;
    }
    
    public void set_username_ptixiouxou(String username_ptixiouxou)
            
    {
        this.username_ptixiouxou = username_ptixiouxou;
        
    }
    
    public int get_kodikos_metaptixiakou_programmatos()
            
    {
        return kodikos_metaptixiakou_programmatos;
    }    
   

    public void set_kodikos_metaptixiakou_programmatos(int kodikos_metaptixiakou_programmatos)
            
    {
        this.kodikos_metaptixiakou_programmatos = kodikos_metaptixiakou_programmatos;
        
    }	

	public Date get_imerominia()
            
    {
            
        return imerominia;
    }
	
	
    public void set_imerominia(Date imerominia)
            
    {
        this.imerominia = imerominia;
        
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

