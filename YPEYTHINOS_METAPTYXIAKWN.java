
package com.mycompany.careerfinder;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;


public class YPEYTHINOS_METAPTYXIAKWN {
    
    private String name;
    private String surname;
    private String dieuthinsi;
    private long tilefwno;
    private String username;
    private String email;
    private String password;
    private String onoma_sxolhs;
    private String onomna_panepistimiou;
    private String xwra_panepistimiou;
    private String poli_panepistimiou;
    private long thlefwno_sxolhs;
    
    
    
    
    public YPEYTHINOS_METAPTYXIAKWN(String name, String surname, String dieuthinsi, long tilefwno, String username, String email, String password, String onoma_sxolhs, String onomna_panepistimiou, String xwra_panepistimiou, String poli_panepistimiou, long thlefwno_sxolhs)
    {
    this.name = name;
    this.surname = surname;
    this.dieuthinsi = dieuthinsi;
    this.tilefwno = tilefwno;
    this.username = username;
    this.email = email;
    this.password = password;
    this.onoma_sxolhs = onoma_sxolhs;
    this.onomna_panepistimiou = onomna_panepistimiou;
    this.xwra_panepistimiou = xwra_panepistimiou;
    this.poli_panepistimiou = poli_panepistimiou;
    this.thlefwno_sxolhs = thlefwno_sxolhs;
    }
    
     public String get_name()
            
    {
        
        return name;
    }
    
    public void set_name(String name)
            
    {
        this.name = name;
        
    }
            
     public String get_surname()
            
    {
        
        return surname;
    }
    
    public void set_surname(String surname)
            
    {
        this.surname = surname;
        
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
    
    
    public String get_email()
            
    {
        
        return email;
    }
    
    public void set_email(String email)
            
    {
        this.email = email;
        
    }
    
     public String get_password()
            
    {
        
        return password;
    }
    
    public void set_password(String password)
            
    {
        this.password = password;
        
    }
    
   
      public String get_onoma_sxolhs()
            
    {
        
        return onoma_sxolhs;
    }
    
    public void set_onoma_sxolhs(String onoma_sxolhs)
            
    {
        this.onoma_sxolhs = onoma_sxolhs;
        
    }
    
    
    
        public String get_onomna_panepistimiou()
            
    {
        
        return onomna_panepistimiou;
    }
    
    public void set_onomna_panepistimiou(String onomna_panepistimiou)
            
    {
        this.onomna_panepistimiou = onomna_panepistimiou;
        
    }
    
    
        public String get_xwra_panepistimiou()
            
    {
        
        return xwra_panepistimiou;
    }
    
    public void set_xwra_panepistimiou(String xwra_panepistimiou)
            
    {
        this.xwra_panepistimiou = xwra_panepistimiou;
        
    }
    
           public String get_poli_panepistimiou()
            
    {
        
        return poli_panepistimiou;
    }
    
    public void set_poli_panepistimiou(String poli_panepistimiou)
            
    {
        this.poli_panepistimiou = poli_panepistimiou;
        
    }
    
    
     public long get_thlefwno_sxolhs()
            
    {
        return thlefwno_sxolhs;
    }
    
    public void set_thlefwno_sxolhs(long thlefwno_sxolhs)
            
    {
        this.thlefwno_sxolhs = thlefwno_sxolhs;
    }
    
    public ArrayList<AITHSH_GIA_METAPTYXIAKO> get_aitiseis_metaptyxiakwn(int kodikos)
            
    {
        ArrayList<AITHSH_GIA_METAPTYXIAKO> result = new ArrayList<AITHSH_GIA_METAPTYXIAKO>();
        
        for(AITHSH_GIA_METAPTYXIAKO a: Careerfinder.aitiseis_metaptyxiakwn)
            
        {
            if(a.get_kodikos_metaptixiakou_programmatos()==kodikos)
                
            {
                
                result.add(a);
            }
            
        }
        
        return result;
    }
    
    public PTYXIOUXOS get_ptyxiouxos(String username)
            
    {
        PTYXIOUXOS result = null;
        
        for(PTYXIOUXOS p: Careerfinder.ptyxiouxoi)
            
        {
            if(p.get_username().equals(username))
                
                
            {
                result = p;
                
            }
            
        }
        return result;
    }
    
    public String get_apodeiktiko(String username)
            
    {
        String result = null;
        
        for(PTYXIOUXOS p: Careerfinder.ptyxiouxoi)
            
        {
            if(p.get_username().equals(username))
                
            {
                result = p.get_apodeiktiko_ptyxiou();
                
            }
            
            
        }
        return result;
    }
    
    public void dimourgia_prosklisis(ArrayList<String> mylist)
            
    {
        String paraliptis = mylist.get(0);
        
        String thema = mylist.get(1);
        
        String minima = mylist.get(2);

        Date d1 = new Date();
        
        Time t1 = new Time(0,0,0);
        
        
        PROSKLISI p1 = new PROSKLISI(Careerfinder.proskliseis.size()+1,this.username,paraliptis,thema,minima,d1,t1);
        
        Careerfinder.proskliseis.add(p1);
        
    }
    
    public AKSIOLOGHSH get_aksilogisi(int kodikos_aitisis)
            
    {
        AKSIOLOGHSH result = null;
        
        for(AKSIOLOGHSH a: Careerfinder.aksiologiseis)
            
        {
            if (a.get_kodikos_aithshs()==kodikos_aitisis)
                
            {
                result = a;
            }
            
        }
        
        return result;
    }
    
    public void prosthiki_vathmou_aksiologisis(double vathmos, int kodikos_aksiologisis)
    {
        for(AKSIOLOGHSH a: Careerfinder.aksiologiseis)
            
        {
            if(a.get_kodikos_aksiologhshs()==kodikos_aksiologisis)
                
            {
                a.set_vathmos(vathmos);
                
            }
            
        }
        
    }
    
    public void prosthiki_sxoliou_aksologisis(String sxolio, int kodikos_aksiologisis)
            
    {
        for(AKSIOLOGHSH a: Careerfinder.aksiologiseis)
            
        {
            if(a.get_kodikos_aksiologhshs()==kodikos_aksiologisis)
                
            {
                a.set_sxolia(sxolio);
                
            }
            
        }
        
    }
    
    public void dimiourgia_metaptyxiakou(ArrayList<String> mylist)
            
    {
        String sxoli = mylist.get(0);
        
        String panep = mylist.get(1);
        
        String titlos = mylist.get(2);
        
        double vathmos = Double.valueOf(mylist.get(3));
        
        int eksamina = Integer.valueOf(mylist.get(4));
        
        String tropos = mylist.get(5);
        
        double poso = Double.valueOf(mylist.get(6));
        
        METAPTIXIAKO_PROGRAMMA m = new METAPTIXIAKO_PROGRAMMA(Careerfinder.metaptyxiaka.size()+1,sxoli,panep,titlos,vathmos,eksamina,tropos,poso);
        
        Careerfinder.metaptyxiaka.add(m);
        
    }
    
            
     }
