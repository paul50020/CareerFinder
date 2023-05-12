
package com.mycompany.careerfinder;


public class THESI_ERGASIAS {
    
    
    private int id;
    private String epwnumia_etairias;
    private String titlos_thesis;
    private String tropos_ergasias;
    private Float misthos;
    private String apaitoumenos_titlos_ptyxioy;
    private String apaitoumenos_titlos_ptyxiakis;
    private Float apaitoumenos_vathmos_ptyxiakis;
    private Boolean sustatiki_epistoli;
    
    
    
    
    public THESI_ERGASIAS (int id, String epwnumia_etairias, String titlos_thesis, String tropos_ergasias, Float misthos, String apaitoumenos_titlos_ptyxioy, String apaitoumenos_titlos_ptyxiakis, Float apaitoumenos_vathmos_ptyxioy, Boolean sustatiki_epistoli)
    {
    
    this.id = id;
    this.epwnumia_etairias = epwnumia_etairias;
    this.titlos_thesis = titlos_thesis;
    this.tropos_ergasias = tropos_ergasias;
    this.misthos = misthos;
    this.apaitoumenos_titlos_ptyxioy = apaitoumenos_titlos_ptyxioy;
    this.apaitoumenos_titlos_ptyxiakis = apaitoumenos_titlos_ptyxiakis;
    this.apaitoumenos_vathmos_ptyxiakis = apaitoumenos_vathmos_ptyxiakis;
    this.sustatiki_epistoli = sustatiki_epistoli;
    
     
    }
    
    
    
     public int get_id()
            
    {
        return id;
    }
    
    public void set_id(int id)
            
    {
        this.id = id;
    }   
    
     public String get_epwnumia_etairias()
            
    {
        return epwnumia_etairias;
    }
    
    public void set_epwnumia_etairias(String epwnumia_etairias)
            
    {
        this.epwnumia_etairias = epwnumia_etairias;
    } 
         
       public String get_titlos_thesis()
            
    {
        return titlos_thesis;
    }
    
    public void set_titlos_thesis(String titlos_thesis)
            
    {
        this.titlos_thesis = titlos_thesis;
    } 
    
    public String get_tropos_ergasias()
            
    {
        return tropos_ergasias;
    }
    
    public void set_tropos_ergasias(String tropos_ergasias)
            
    {
        this.tropos_ergasias = tropos_ergasias;
    } 
    
    public Float get_misthos()
            
    {
        return misthos;
    }
    
    public void set_misthos(Float misthos)
            
    {
        this.misthos = misthos;
    } 

     public String get_apaitoumenos_titlos_ptyxioy()
            
    {
        return apaitoumenos_titlos_ptyxioy;
    }
    
    public void set_apaitoumenos_titlos_ptyxioy(String apaitoumenos_titlos_ptyxioy)
            
    {
        this.apaitoumenos_titlos_ptyxioy = apaitoumenos_titlos_ptyxioy;
    } 

      public String get_apaitoumenos_titlos_ptyxiakis()
            
    {
        return apaitoumenos_titlos_ptyxiakis;
    }
    
    public void set_apaitoumenos_titlos_ptyxiakis(String apaitoumenos_titlos_ptyxiakis)
            
    {
        this.apaitoumenos_titlos_ptyxiakis = apaitoumenos_titlos_ptyxiakis;
    }    
 
    public Float get_apaitoumenos_vathmos_ptyxiakis()
            
    {
        return apaitoumenos_vathmos_ptyxiakis;
    }
    
    public void set_apaitoumenos_vathmos_ptyxiakis(Float apaitoumenos_vathmos_ptyxiakis)
            
    {
        this.apaitoumenos_vathmos_ptyxiakis = apaitoumenos_vathmos_ptyxiakis;
    } 
    
    public Boolean get_sustatiki_epistoli()
            
    {
        return sustatiki_epistoli;
    }
    
    public void set_sustatiki_epistoli(Boolean sustatiki_epistoli)
            
    {
        this.sustatiki_epistoli = sustatiki_epistoli;
    } 
    
}
