
package com.mycompany.careerfinder;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;


public class PTYXIOUXOS {
    
private String onoma;

	private String eponimo;
        private String xwra;
	private String poli;
	private String dieuthinsi;
	private long tilefwno;
	private String username;
	private String password;
	private String onoma_panepisthmiou;
	private String klados_spoudwn;
	private double vathmos_ptyxiou;
	private double vathmos_diplomatikhs;
	private String titlos_diplomatikis;
	private String apodeiktiko_ptyxiou;
	private String deksiothtes;
	private String epipleon_ptixia;
        private String email;
	

	public PTYXIOUXOS(String onoma, String eponimo, String xwra, String poli, String dieuthinsi, long tilefwno, String username,  String password, String onoma_panepisthmiou, String klados_spoudwn, double vathmos_ptyxiou, double vathmos_diplomatikhs, String titlos_diplomatikis, String apodeiktiko_ptyxiou, String deksiothtes, String epipleon_ptixia, String email)

	{	
		this.onoma = onoma;
		
		this.eponimo = eponimo;
		
		this.xwra = xwra;
		
		this.poli = poli;
		
		this.dieuthinsi = dieuthinsi;
		
		this.tilefwno = tilefwno;
		
		this.username = username;
		
		this.password = password;
		
		this.onoma_panepisthmiou = onoma_panepisthmiou;
		
		this.klados_spoudwn = klados_spoudwn;
		
		this.vathmos_ptyxiou = vathmos_ptyxiou;
		
		this.vathmos_diplomatikhs = vathmos_diplomatikhs;
		
		this.titlos_diplomatikis = titlos_diplomatikis;
		
		this.apodeiktiko_ptyxiou = apodeiktiko_ptyxiou;
		
		this.deksiothtes = deksiothtes;
		
		this.epipleon_ptixia = epipleon_ptixia;
		
                this.email = email;
	}
	
	
        public String get_email()
                
        {
            
            return email;
        }
	
	public String get_onoma()
            
    {
        return onoma;
    }
    
    public void set_onoma(String onoma)
            
    {
        this.onoma = onoma;
    }
	
	
	
	public String get_eponimo()
            
    {
        return eponimo;
    }
    
    public void set_eponimo(String eponimo)
            
    {
        this.eponimo = eponimo;
    }	



	public String get_xwra()
            
    {
        return xwra;
    }
    
    public void set_xwra(String xwra)
            
    {
        this.xwra = xwra;
    }	





	public String get_poli()
            
    {
        return poli;
    }
    
    public void set_poli(String poli)
            
    {
        this.poli = poli;
    }	



	public String get_dieuthinsi()
            
    {
        return dieuthinsi;
    }
    
    public void set_dieuthinsi(String dieuthinsi)
            
    {
        this.dieuthinsi = dieuthinsi;
    }	




	public long get_tilefwno()
            
    {
        return tilefwno;
    }
    
    public void set_tilefwno(long tilefwno)
            
    {
        this.tilefwno = tilefwno;
    }	



	public String get_username()
            
    {
        return username;
    }
    
    public void set_username(String username)
            
    {
        this.username = username;
    }	




	public String get_password()
            
    {
        return password;
    }
    
    public void set_password(String password)
            
    {
        this.password = password;
    }	



	public String get_onoma_panepisthmiou()
            
    {
        return onoma_panepisthmiou;
    }
    
    public void set_onoma_panepisthmiou(String onoma_panepisthmiou)
            
    {
        this.onoma_panepisthmiou = onoma_panepisthmiou;
    }	



	public String get_klados_spoudwn()
            
    {
        return klados_spoudwn;
    }
    
    public void set_klados_spoudwn(String klados_spoudwn)
            
    {
        this.klados_spoudwn = klados_spoudwn;
    }	



	public double get_vathmos_ptyxiou()
            
    {
        return vathmos_ptyxiou;
    }
    
    public void set_vathmos_ptyxiou(float vathmos_ptyxiou)
            
    {
        this.vathmos_ptyxiou = vathmos_ptyxiou;
    }	



	public double get_vathmos_diplomatikhs()
            
    {
        return vathmos_diplomatikhs;
    }
    
    public void set_vathmos_diplomatikhs(double vathmos_diplomatikhs)
            
    {
        this.vathmos_diplomatikhs = vathmos_diplomatikhs;
    }	



	public String get_titlos_diplomatikis()
            
    {
        return titlos_diplomatikis;
    }
    
    public void set_titlos_diplomatikis(String titlos_diplomatikis)
            
    {
        this.titlos_diplomatikis = titlos_diplomatikis;
    }	



	public String get_apodeiktiko_ptyxiou()
            
    {
        return apodeiktiko_ptyxiou;
    }
    
    public void set_apodeiktiko_ptyxiou(String apodeiktiko_ptyxiou)
            
    {
        this.apodeiktiko_ptyxiou = apodeiktiko_ptyxiou;
    }	



	public String get_deksiothtes()
            
    {
        return deksiothtes;
    }
    
    public void set_deksiothtes(String deksiothtes)
            
    {
        this.deksiothtes = deksiothtes;
    }	



	public String get_epipleon_ptixia()
            
    {
        return epipleon_ptixia;
    }
    
    public void set_epipleon_ptixia(String epipleon_ptixia)
            
    {
        this.epipleon_ptixia = epipleon_ptixia;
    }	
    
    
   public ArrayList<AITISI_GIA_THESI_ERGASIAS> get_aitiseis_theseis_ergasias()
           
   {
       ArrayList<AITISI_GIA_THESI_ERGASIAS> result = new ArrayList<AITISI_GIA_THESI_ERGASIAS>();
       
       for(AITISI_GIA_THESI_ERGASIAS a: Careerfinder.aitiseis_thesewn_ergasias)
           
       {
           if(a.get_username_ptyxiouxou().equals(this.username))
               
           {
               result.add(a);
               
           }
           
       }
       
       return result;
   }
   
   public void diagrafi_aitisis_thesis_ergasias(int kodikos)
           
   {
       
       for(AITISI_GIA_THESI_ERGASIAS a: Careerfinder.aitiseis_thesewn_ergasias)
           
       {
           if(a.get_username_ptyxiouxou().equals(this.username) && a.get_kwdikos_aitisis()==kodikos)
               
           {
               
               Careerfinder.aitiseis_thesewn_ergasias.remove(a);
               
               break;
               
           }
           
       }
       
       
   }
    
  public AITISI_GIA_THESI_ERGASIAS get_aitisi_thesis_ergasias(int kodikos)
          
  {
      
      AITISI_GIA_THESI_ERGASIAS result = null;
      
       for(AITISI_GIA_THESI_ERGASIAS a: Careerfinder.aitiseis_thesewn_ergasias)
           
       {
           if(a.get_username_ptyxiouxou().equals(this.username) && a.get_kwdikos_aitisis()==kodikos)
               
           {
               
               result = a;
               
               break;
               
           }
           
       }
      
     return result; 
      
  }
	
 public ArrayList<AITHSH_GIA_METAPTYXIAKO> get_aitiseis_metaptyxiaka()
         
 {
     ArrayList <AITHSH_GIA_METAPTYXIAKO> result = new ArrayList<AITHSH_GIA_METAPTYXIAKO>();
     
     
     for(AITHSH_GIA_METAPTYXIAKO a: Careerfinder.aitiseis_metaptyxiakwn)
         
     {
         if(a.get_username_ptixiouxou().equals(this.username))
             
         {
             result.add(a);
             
         }
         
     }
     
     
     return result;
 }
 
    
   public void diagrafi_aitisis_metaptyxiakou(int kodikos)
           
   {
       
       for(AITHSH_GIA_METAPTYXIAKO a: Careerfinder.aitiseis_metaptyxiakwn)
           
       {
           if(a.get_username_ptixiouxou().equals(this.username) && a.get_kodikos_aithshs()==kodikos)
               
           {
               
               Careerfinder.aitiseis_metaptyxiakwn.remove(a);
               
               break;
               
           }
           
       }
       
       
   }
 
   
   public AITHSH_GIA_METAPTYXIAKO get_aitisi_metaptyxiakou(int kodikos)
          
  {
      
      AITHSH_GIA_METAPTYXIAKO result = null;
      
       for(AITHSH_GIA_METAPTYXIAKO a: Careerfinder.aitiseis_metaptyxiakwn)
           
       {
           if(a.get_username_ptixiouxou().equals(this.username) && a.get_kodikos_aithshs()==kodikos)
               
           {
               
               result = a;
               
               break;
               
           }
           
       }
      
     return result; 
      
  }
   
   public ArrayList<THESI_ERGASIAS> get_theseis_ergasia()
           
   {
       return Careerfinder.theseis_ergasias;
       
   }
   
   public void dimiourgia_aitisi_thesi_ergasias(int kodikos_thesis)
   
   {
       Date d1 = new Date();
       
       Time t1 = new Time(0,0,0);
       
       AITISI_GIA_THESI_ERGASIAS ait1 = new AITISI_GIA_THESI_ERGASIAS(Careerfinder.aitiseis_thesewn_ergasias.size()+1,this.username,kodikos_thesis,d1,t1,"pros eggrisi");
       
       Careerfinder.aitiseis_thesewn_ergasias.add(ait1);
       
   }
   
   public ArrayList<THESI_ERGASIAS> anazitisi_thesewn_ergasias(ArrayList<String> kritiria)
           
   {
       ArrayList<THESI_ERGASIAS> result = new ArrayList<THESI_ERGASIAS> ();
       
       double misthos_min = Double.valueOf(kritiria.get(0));
       
       double misthos_max = Double.valueOf(kritiria.get(1));
       
       String antikeimeno = kritiria.get(2);
       
       String typos = kritiria.get(3);
       
       for(THESI_ERGASIAS t: Careerfinder.theseis_ergasias)
       
       {
           if(t.get_misthos()>=misthos_min && t.get_misthos()<=misthos_max && t.get_apaitoumenos_titlos_ptyxioy().equals(antikeimeno)&& t.get_tropos_ergasias().equals(typos))
           
           {
               result.add(t);
               
           }
       }
       
       return result;
   }
   
   
   public ArrayList<METAPTIXIAKO_PROGRAMMA> get_metaptyxiaka()
           
   {
       return Careerfinder.metaptyxiaka;
       
   
       
   }
   
   public void dimiiourgia_aitisi_metaptyxiakou(int kodikos_metaptyxiakou)
   
   {
       
       Date d1 = new Date();
       
       Time t1 = new Time(0,0,0);
       
       AITHSH_GIA_METAPTYXIAKO ait1 = new AITHSH_GIA_METAPTYXIAKO(Careerfinder.aitiseis_metaptyxiakwn.size()+1,this.username,kodikos_metaptyxiakou,d1,t1,"pros eggrisi");
       
       Careerfinder.aitiseis_metaptyxiakwn.add(ait1);
       
       
   }
   
   public ArrayList<METAPTIXIAKO_PROGRAMMA> anazitisi_metaptyxiakwn(ArrayList<String> kritiria)
           
   {
       ArrayList<METAPTIXIAKO_PROGRAMMA> result = new ArrayList<METAPTIXIAKO_PROGRAMMA> ();
       
       double didaktra_min = Double.valueOf(kritiria.get(0));
       
       double didaktra_max = Double.valueOf(kritiria.get(1));
       
       String antikeimeno = kritiria.get(2);
       
       String typos = kritiria.get(3);
       
       for(METAPTIXIAKO_PROGRAMMA t: Careerfinder.metaptyxiaka)
       
       {
           if(t.get_poso_ana_eksamhno()>=didaktra_min && t.get_poso_ana_eksamhno()<=didaktra_max && t.get_titlos_programmatos().equals(antikeimeno)&& t.get_tropos_didaskalias().equals(typos))
           
           {
               result.add(t);
               
           }
       }
       
       return result;
   }
   
   
   
   
 
}
