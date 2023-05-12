
package com.mycompany.careerfinder;

import java.sql.Time;
import java.util.Date;


public class ΜΗΝΥΜΑ {
  
    private int id;
    private String username_apostolea;
    private String username_paralipti; 
    private String thema; 
    private String periexomeno; 
    private Date hmeromhnia;
    private Time wra;
    private String episynaptomena_arxeia; 


   public  ΜΗΝΥΜΑ(int id, String username_apostolea, String username_paralipti, String thema, String periexomeno, Date hmeromhnia, Time wra,String episynaptomena_arxeia)

   {
   
   this.id = id;
   this.username_apostolea = username_apostolea;
   this.username_paralipti = username_paralipti;
   this.thema = thema;
   this.periexomeno = periexomeno;
   this.hmeromhnia = hmeromhnia;
   this.wra = wra;
   this.episynaptomena_arxeia = episynaptomena_arxeia;

   
   
   
   }  
   
 public int get_id()
            
    {
        return id;
    }
    
    public void set_id(int id)
            
    {
        this.id = id;
    }   
   
     public String get_username_apostolea()
            
    {
        return username_apostolea;
    }
    
    public void set_username_apostolea(String username_apostolea)
            
    {
        this.username_apostolea = username_apostolea;
    } 

         public String get_username_paralipti()
            
    {
        return username_paralipti;
    }
    
    public void set_username_paralipti(String username_paralipti)
            
    {
        this.username_paralipti = username_paralipti;
    } 
    
    
         public String get_thema()
            
    {
        return thema;
    }
    
    public void set_thema(String thema)
            
    {
        this.thema = thema;
    }
    
    public String get_periexomeno()
            
    {
        return periexomeno;
    }
    
    public void set_periexomeno(String periexomeno)
            
    {
        this.periexomeno = periexomeno;
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
    
    public String get_episynaptomena_arxeia()
            
    {
        return episynaptomena_arxeia;
    }
    
    public void set_episynaptomena_arxeia(String episynaptomena_arxeia)
            
    {
        this.episynaptomena_arxeia = episynaptomena_arxeia;
    }
    
    
}
