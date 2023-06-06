package com.mycompany.careerfinder;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

import java.io.File;  


public class Careerfinder {
    
    public static ArrayList<AITHSH_GIA_METAPTYXIAKO> aitiseis_metaptyxiakwn = new ArrayList<AITHSH_GIA_METAPTYXIAKO>();
    
    public static ArrayList<AITISI_GIA_THESI_ERGASIAS> aitiseis_thesewn_ergasias = new ArrayList<AITISI_GIA_THESI_ERGASIAS>();
    
    public static ArrayList<AKSIOLOGHSH> aksiologiseis = new ArrayList<AKSIOLOGHSH>();
    
    public static ArrayList<INTERVIEW> sinenteykseis = new ArrayList<INTERVIEW>();
    
    public static ArrayList<IPEUTHINOS_ANTHRWPINOU_DUNAMIKOU> ipefthinoi_anthropinou_dinamikou = new ArrayList<IPEUTHINOS_ANTHRWPINOU_DUNAMIKOU>();
    
    public static ArrayList<METAPTIXIAKO_PROGRAMMA> metaptyxiaka = new ArrayList<METAPTIXIAKO_PROGRAMMA>();
    
    public static ArrayList<PROSKLISI> proskliseis = new ArrayList<PROSKLISI>();
    
    public static ArrayList<PTYXIOUXOS> ptyxiouxoi = new ArrayList<PTYXIOUXOS>();
    
    public static ArrayList<THESI_ERGASIAS> theseis_ergasias = new ArrayList<THESI_ERGASIAS>();
    
    public static ArrayList<YPEYTHINOS_METAPTYXIAKWN> ipefthinoi_metaptyxiakwn = new ArrayList<YPEYTHINOS_METAPTYXIAKWN>();
    
    public static ArrayList<MHNYMA> minimata = new ArrayList<MHNYMA>();


    public static void main(String[] args) {
        
        
        PTYXIOUXOS p1 = new PTYXIOUXOS("Nikos","Nikolopoulos","Ellada","Patra", "Korinthou 100",222222, "nikos","1234","Panepistimio Patrwn","Mixanikos Ypologistwn",7.30,10,"Dimiourgia Istoselidas", "ptyxio_nikoloupolos.pdf", "Programmatismos", "Proficiency","nikos@gmail.com");
        
        PTYXIOUXOS p2 = new PTYXIOUXOS("Giannis","Giannopoulos","Ellada","Athina", "Lemesou 200",356789, "giannis","1234","Panepistimio Patrwn","Ilektrologos Mixanikos",6.70,9,"Sxediasmos Ilektrikwn Kyklwmatwn", "ptyxio_giannopoulos.pdf", "Verilog", "ECDL","giannis@gmail.com");

        ptyxiouxoi.add(p1);
        
        ptyxiouxoi.add(p2);
        
      METAPTIXIAKO_PROGRAMMA mp1 = new  METAPTIXIAKO_PROGRAMMA (1, "CEID", "Patras" ,"Texniti Noimosini", 7.5, 4, "Online", 800);
      
      METAPTIXIAKO_PROGRAMMA mp2 = new  METAPTIXIAKO_PROGRAMMA (2, "CEID", "Patras" ,"Epeksergia Simatwn", 7.2, 4, "Dia zosis", 700);
      
        metaptyxiaka.add(mp1);
     
        metaptyxiaka.add(mp2);
        
      THESI_ERGASIAS t1 = new THESI_ERGASIAS (1,"Google","Software Engineer","Online", 2000, "Mixanikos Ypologistwn","Mixanes Anazitisis", 8, true);
      
      THESI_ERGASIAS t2 = new THESI_ERGASIAS (2,"Microsoft","Database Engineer","Dia zosis", 2500, "Mixanikos Ypologistwn","Vaseis Dedomwnwn", 9, false);
      
      theseis_ergasias.add(t1);
      
      theseis_ergasias.add(t2);
     
     YPEYTHINOS_METAPTYXIAKWN ym1 = new YPEYTHINOS_METAPTYXIAKWN("Kostas","Kostopoulos","Karaiskaki 260", 631578,"kostas", "kostas@gmail.com", "1234", "CEID", "Patras", "Ellada","Patra", 935693);
     
     YPEYTHINOS_METAPTYXIAKWN ym2 = new YPEYTHINOS_METAPTYXIAKWN("Ilias","Ilopoulos","Othonos Amalias", 523999,"ilias", "ilias@gmail.com", "1234", "ECE", "Patras", "Ellada","Patra", 923888);
     
     ipefthinoi_metaptyxiakwn.add(ym1);
     
     ipefthinoi_metaptyxiakwn.add(ym2);
     
     Date date1 = new Date();
     
     Time time1 = new Time(5,7,8);
     
     AITHSH_GIA_METAPTYXIAKO am1 = new AITHSH_GIA_METAPTYXIAKO(1, "nikos", 1, date1,time1, "ekkremotita");
     
     
     Date date2 = new Date();
     
     Time time2 = new Time(10,12,15);
     
     AITHSH_GIA_METAPTYXIAKO am2 = new AITHSH_GIA_METAPTYXIAKO(2, "giannis", 2, date2,time2, "ekkremotita");
     
     aitiseis_metaptyxiakwn.add(am1);
     
     aitiseis_metaptyxiakwn.add(am2);
     
     
     AITISI_GIA_THESI_ERGASIAS at1 = new AITISI_GIA_THESI_ERGASIAS (1,"nikos",1, date1,time1,"ekkremotita");
     
     AITISI_GIA_THESI_ERGASIAS at2 = new AITISI_GIA_THESI_ERGASIAS (2,"giannis",2, date2,time2,"ekkremotita");
     
     
    IPEUTHINOS_ANTHRWPINOU_DUNAMIKOU iad1 = new IPEUTHINOS_ANTHRWPINOU_DUNAMIKOU ("Pavlos","Pavlopoulos","Athina", " Antistaseos 200", 455478,"pavlos", "pavlos@gmail.com","1234","Google");
    
    IPEUTHINOS_ANTHRWPINOU_DUNAMIKOU iad2 = new IPEUTHINOS_ANTHRWPINOU_DUNAMIKOU ("Takis","Takopoulos","Karditsa", " Patreos 200", 321478,"takis", "takis@gmail.com","1234","Microsoft");
    
    
    ipefthinoi_anthropinou_dinamikou.add(iad1);
    
    ipefthinoi_anthropinou_dinamikou.add(iad2);

    
    AKSIOLOGHSH aks1 = new AKSIOLOGHSH(1,1, 8.5, "Poly kalos", date1, time1);
     
    AKSIOLOGHSH aks2 = new AKSIOLOGHSH(2,2, 9.3, "Aristos", date2, time2); 
    
    aksiologiseis.add(aks1);
    
    aksiologiseis.add(aks2);
    
    INTERVIEW it1 = new INTERVIEW(1,"pavlos", "nikos",date1,time1);
    
    INTERVIEW it2 = new INTERVIEW(2,"takis", "giannis",date2,time2);
    
    sinenteykseis.add(it1);
    
    sinenteykseis.add(it2);
    
    
    PROSKLISI pr1 = new PROSKLISI(1, "pavlos", "nikos", "Welcome", "thema", date1,time1);
    
    PROSKLISI pr2 = new PROSKLISI(2, "pavlos", "takis", "Welcome2", "thema2", date2,time2);
    
    proskliseis.add(pr1);
    
    proskliseis.add(pr2);
    
    MHNYMA m1 = new MHNYMA(1,"giannis","pavlos", "Thema 1", "Periexomeno 1", date1,time1,"attach1.pdf");
    
    MHNYMA m2 = new MHNYMA(2,"nikos","takis", "Thema 2", "Periexomeno 2", date2,time2,"attach2.pdf");
    
    minimata.add(m1);
    
    minimata.add(m2);

     
    }
    
    public static int check_registration_first_step(ArrayList<String> mylist)
            
    {
        
        int result = 1;
        
        String name = mylist.get(0);
        
        String surname = mylist.get(1);
        
        String country = mylist.get(2);
        
        String city  = mylist.get(3);
        
        String address = mylist.get(4);
        
        String phone = mylist.get(5);
        
        String username = mylist.get(6);
        
        String email = mylist.get(7);
        
        String pass1 = mylist.get(8);
        
        String pass2 = mylist.get(9);
        
        
        if(name.equals("")||surname.equals("")||country.equals("")||city.equals("")|| address.equals("")||phone.equals("")|| username.equals("")||pass1.equals("")||pass2.equals("")|| email.equals(""))
        
        {
            return 0;
        }
        
        int found = 0;
        
        for (PTYXIOUXOS p: ptyxiouxoi)
            
        {
            if (p.get_username().equals(username))
                
            {
                found = 1;
                
                break;
                
            }
            
        }
        
        if(found==1)
            
        {
            return 2;
            
        }
        
        found = 0;
        
             for (PTYXIOUXOS p: ptyxiouxoi)
            
        {
            if (p.get_email().equals(email))
                
            {
                found = 1;
                
                break;
                
            }
            
        }
             
        if( found ==1)
            
        {
            return 3;
            
        }
        
        
        if(pass1!=pass2)
            
        {
            return 4;
            
        }
        
        
        
        return result;
    }
    
	public static int check_registration_file(String onoma){
		
		
		int result = 1;
		
		
		if(!onoma.endsWith((".pdf")))
             
             
         {
             return 4;
             
         }
         
         File f1 = new File(onoma);
         
         if(f1.length() / (1024 * 1024)>50)
             
         {
             
             return 5;
         }
		
		
		
		
		
		return result;
		

		
	}
	
	
	
	
	
	
	
	
     public static int check_registration_second_step(ArrayList<String> mylist)
             
     
     {
         
         int result = 1;
         
         String uni_name  = mylist.get(0);
         
         double degree = Double.valueOf(mylist.get(1));
         
         double diploma  = Double.valueOf(mylist.get(2));
         
         String sector = mylist.get(3);
         
         String title = mylist.get(4);
         
        
         
         
         if(degree < 5 || degree > 10)
             
         {
             return 2;
             
         }
         
         if(diploma > 5 || diploma > 10)
         {
             
             return 3;
             
         }
         
         
         
         
         
         return result;
     }
     
     public static  boolean final_check(ArrayList<String> mylist1, ArrayList<String> mylist2)
             
     {
         if(check_registration_first_step(mylist1)==1 && check_registration_second_step(mylist2)==1)
             
         {
             return true;
             
         }
         
         else 
             
         {
             
             return false;
         }
         
     }
     
     void create_ptyxiouxos(ArrayList<String> mylist)
             
     {
        String onoma = mylist.get(0);
         
        String eponimo = mylist.get(1);
        String xwra = mylist.get(2);
	String poli = mylist.get(3);
	String dieuthinsi = mylist.get(4);
	long tilefwno =Long.valueOf(mylist.get(5));
	String username =mylist.get(6);
	String password = mylist.get(7);
	String onoma_panepisthmiou = mylist.get(8);
	String klados_spoudwn = mylist.get(9);
	double vathmos_ptyxiou = Double.valueOf(mylist.get(10));
	double vathmos_diplomatikhs = Double.valueOf(mylist.get(11));
	String titlos_diplomatikis = mylist.get(12);
	String apodeiktiko_ptyxiou = mylist.get(13);
	String deksiothtes  = mylist.get(14);
	String epipleon_ptixia = mylist.get(15);
        String email = mylist.get(16);
        
        PTYXIOUXOS p1 = new PTYXIOUXOS(onoma, eponimo, xwra, poli, dieuthinsi, tilefwno,username, password, onoma_panepisthmiou, klados_spoudwn, vathmos_ptyxiou, vathmos_diplomatikhs, titlos_diplomatikis, apodeiktiko_ptyxiou, deksiothtes, epipleon_ptixia, email);
         
        ptyxiouxoi.add(p1);
     }
     
     public static int check_aitisi_thesis_ergasias(ArrayList<String> mylist)
             
     {
         int result = 1;
         
         String onoma = mylist.get(0);
         
         String eponimo = mylist.get(1);
         
         String onoma_panep = mylist.get(2);
         
         String titlos_dipl = mylist.get(3);
         
         double ptyxio = Double.valueOf(mylist.get(4));
         
         double diploma = Double.valueOf(mylist.get(5));
         
         String apodeiktiko = mylist.get(6);
         
         String sistatiki  = mylist.get(7);
         
         
         if(onoma.equals("") || eponimo.equals("")|| onoma_panep.equals("")|| titlos_dipl.equals("")||ptyxio==0 || diploma==0 ||apodeiktiko.equals("")||sistatiki.equals(""))
         {
             return 0;
         }
         
         File f1 = new File(apodeiktiko);
         
         if(f1.length() / (1024 * 1024)>50)
             
         {
             
             return 2;
         }
         
          File f2 = new File(sistatiki);
         
         if(f2.length() / (1024 * 1024)>50)
             
         {
             
             return 3;
         }
         
         if(!apodeiktiko.endsWith(".pdf")|| !sistatiki.endsWith((".pdf")))
             
         {
             
             return 4;
         }
         
         return result;
     }
     
     public static int check_dimiourgia_thesis_first_step(ArrayList<String> mylist)
             
     {
         int result = 1;
         
         String onoma_etaireias = mylist.get(0);
         
         String titlos_thesis = mylist.get(1);
         
         String tropos_ergasias = mylist.get(2);
         
         double misthos = Double.valueOf(mylist.get(3));
         
         if(onoma_etaireias.equals("")|| titlos_thesis.equals("")|| tropos_ergasias.equals("")||misthos==0)
             
         {
             return 0;
             
         }
         
         
         return result;
     }
    
     public static int check_dimiourgia_thesis_second_step(ArrayList<String> mylist)
             
     {
         int result = 1;
         
         String titlos_ptyxiou = mylist.get(0);
         
         String titlos_ptyxiakis = mylist.get(1);
         
         double vathmos = Double.valueOf(mylist.get(2));
         
         boolean sistatiki = Boolean.valueOf(mylist.get(3));
         
         String onoma_etaireias = mylist.get(4);
         
         String titlos_thesis = mylist.get(5);
         
         
         if(titlos_ptyxiou.equals("") || titlos_ptyxiakis.equals("")|| vathmos==0 || sistatiki ==false)
         
         {
           return 0;   
             
         }
         
         for (THESI_ERGASIAS t : Careerfinder.theseis_ergasias)
             
         {
             if (t.get_epwnumia_etairias().equals(onoma_etaireias)&& t.get_titlos_thesis().equals(titlos_thesis))
                 
             {
                 return 2;
                                  
             }
             
         }
         
         
         return result;
     }
     
     public static int check_aitisi_metaptyxiakou (ArrayList<String> mylist)
             
     {
         int result = 1;
         
         String onoma = mylist.get(0);
         
         String eponimo  = mylist.get(1);
         
         String onoma_panep = mylist.get(2);
         
         String titlos_dipl = mylist.get(3);
         
         double ptyxio = Double.valueOf(mylist.get(4));
         
         double diplomatiki = Double.valueOf(mylist.get(5));
         
         String apodeiktiko = mylist.get(6);
         
         if(onoma.equals("")|| eponimo.equals("")|| onoma_panep.equals("")|| titlos_dipl.equals("")||ptyxio==0 || diplomatiki==0 || apodeiktiko.equals("") )
             
         {
            return 0;       
         }
         
         File f1 = new File(apodeiktiko);
         
         if(f1.length() / (1024 * 1024)>50)
             
         {
             
             return 2;
         }
         
         if(!apodeiktiko.endsWith((".pdf")))
             
         {
             return 3;
             
         }
         
         return result;
     }
     
     public static int check_stoixeia_anazitisis_ptyxiouxou(ArrayList<String> mylist)
             
     {
         int result = 1;
         
         String ptyxio = mylist.get(0);
         
         String ptyxiaki = mylist.get(1);
         
         double vathmos = Double.valueOf((mylist.get(2)));
         
         if(ptyxio.equals((""))||ptyxiaki.equals("")|| vathmos==0)
             
         {
             
             return 0;
         }
         
         if(vathmos<0 || vathmos > 10)
             
         {
             
             return 2;
         }
         
         return result;
     }
     
     public static int check_dimiourgia_minimatos (ArrayList<String> mylist)
             
             
     {
         int result=1;
         
         String paraliptis = mylist.get(0);
         
         String thema = mylist.get(1);
         
         String keimeno = mylist.get(2);
         
         String arxeio = mylist.get(3);
         
         if(paraliptis.equals("")|| thema.equals("")|| keimeno.equals("")|| arxeio.equals(""))
         
         {
             return 0;
             
         }
         
         
         
         int found = 0;
         
         for(YPEYTHINOS_METAPTYXIAKWN y: Careerfinder.ipefthinoi_metaptyxiakwn)
         
         {
             if(y.get_username().equals(paraliptis))
                 
             {
                 found = 1;
                 
                 break;
             }
             
         }
         
         if(found==0)
             
         {
             
             return 4;
         }
         
         return result;
     }
     
     public static int check_file_dimiourgia_minimatos(String arxeio)
             
     {
         File f1 = new File(arxeio);
         
         if(f1.length() / (1024 * 1024)>50)
             
         {
             
             return 2;
         }
         
         if(!arxeio.endsWith((".pdf")))
             
         {
             return 3;
             
         } 
         
         return 1;
     }
     
     public static int check_stoixeia_prosklisis(ArrayList<String> mylist)
             
     {
         int result = 1;
         
         String paraliptis = mylist.get(0);
         
         String thema = mylist.get(1);
         
         String keimeno = mylist.get(2);
         
         if(paraliptis.equals("")|| thema.equals("")|| keimeno.equals(""))
             
         {
             return 0;
             
         }
         
         return result;
     }
     
     public static int check_sxolio_aksiologisis(String sxolio)
             
     {
         if(sxolio.equals(""))
             
         {
             
             return 0;
         }
         
         else
             
         {
             
             return 1;
             
         }
         
     }
     
     public static int check_dimiourgia_metaptyxiakou_first_step(ArrayList<String> mylist)
             
     {
         
         int result = 1;
         
         String eponimia = mylist.get(0);
         
         String titlos = mylist.get(1);
         
         double vathmos = Double.valueOf(mylist.get(2));
         
         if(eponimia.equals("")|| titlos.equals("")||vathmos==0)
             
         {
             
             return 0;
         }
         
         int found = 0;
         
         for(METAPTIXIAKO_PROGRAMMA m: Careerfinder.metaptyxiaka)
             
         {
             if(m.get_onoma_sxolhs().equals(eponimia)&& m.get_titlos_programmatos().equals(titlos))
             {
                 found = 1;
                 
                 break;
             }
         }
         
         if(found ==1)
             
         {
             
             return 2;
         }
         
         if( vathmos <5 || vathmos >10)
             
         {
             return 3;
             
         }
         
         return result;
     }
     
     public static int check_dimiourgia_metaptyxiakou_second_step(ArrayList<String> mylist)
             
     {
         int result = 1;
         
         
         int eksamina = Integer.valueOf(mylist.get(0));
         
         String tropos = mylist.get(1);
         
         double poso = Double.valueOf(mylist.get(2));
         
         if(eksamina==0 || tropos.equals("")|| poso==0)
             
         {
             return 0;
             
         }
         
         if(poso < 0)
             
         {
             return 2;
             
         }
         
         return result;
     }
     
}
