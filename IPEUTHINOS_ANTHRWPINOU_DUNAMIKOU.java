
package com.mycompany.careerfinder;

import java.util.*;


public class IPEUTHINOS_ANTHRWPINOU_DUNAMIKOU {
    
private String name;

    private String lastname;

    private String city;

    private String address;

    private long phone_number;

    private String username;

    private String email;

    private String password;

    private String brand_name;



public IPEUTHINOS_ANTHRWPINOU_DUNAMIKOU (String name, String lastname, String city, String address, long phone_number, String username, String email, String password, String brand_name)
    
	{
        
		this.name = name;

        	this.lastname = lastname;

        	this.city = city;

        	this.address = address;

        	this.phone_number = phone_number;

		this.username = username;

		this.email = email;

		this.password = password;

		this.brand_name = brand_name;
    
	}


public String get_name()
    {
        return name;
    }

public void set_name(String name)
    {
        this.name = name;
    }

public String get_lastname()
    {
        return lastname;
    }

public void set_lastname(String lastname)
    {
        this.lastname = lastname;
    }

public String get_city()
    {
        return city;
    }

public void set_city(String city)
    {
        this.city = city;
    }

public String get_address()
    {
        return address;
    }

public void set_address(String address)
    {
        this.address = address;
    }

public long get_phone_number()
    {
        return phone_number;
    }

public void set_phone_number(long phone_number)
    {
        this.phone_number = phone_number;
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

public String get_brand_name()
    {
        return brand_name;
    }

public void set_brand_name(String brand_name)
    {
        this.brand_name = brand_name;
    }


public void dimiourgia_thesis_ergasias(ArrayList<String> mylist)
        
{
    
    String eponimia_etaireias = mylist.get(0);
    
    String titlos_thesis= mylist.get(1);
    
    String tropos_ergasias = mylist.get(2);
    
    double misthos = Double.valueOf(mylist.get(3));
    
    String titlos_ptyxiou = mylist.get(4);
    
    String titlos_ptyxiakis = mylist.get(5);
    
    double vathmos_ptyxiakis = Double.valueOf(mylist.get(6));
    
    boolean systatiki = Boolean.valueOf((mylist.get(7)));
    
    
    THESI_ERGASIAS t1 = new THESI_ERGASIAS(Careerfinder.theseis_ergasias.size()+1,eponimia_etaireias,titlos_thesis, tropos_ergasias, misthos, titlos_ptyxiou,titlos_ptyxiakis, vathmos_ptyxiakis, systatiki);
    
    Careerfinder.theseis_ergasias.add(t1);
}

public ArrayList<PTYXIOUXOS> get_ptyxiouxoi()
        
{
    return Careerfinder.ptyxiouxoi;
    
}

public void taksinomisi_ptyxiouxoi(String kritirio)
        
{
    if(kritirio.equals("eponimo"))
        
    {
       Collections.sort(Careerfinder.ptyxiouxoi,Comparator.comparing(PTYXIOUXOS::get_eponimo));
        
    }
    
    else
        
    {
       
        Collections.sort(Careerfinder.ptyxiouxoi,Comparator.comparing(PTYXIOUXOS::get_titlos_diplomatikis));

        
    }
    
}

public ArrayList<PTYXIOUXOS> get_ptyxiouxoi_filtra(ArrayList<String> mylist)
        
{
    ArrayList<PTYXIOUXOS> result = new ArrayList<PTYXIOUXOS>();
    
    String ptyxio = mylist.get(0);
         
    String ptyxiaki = mylist.get(1);
         
    double vathmos = Double.valueOf((mylist.get(2)));
    
    for(PTYXIOUXOS p: Careerfinder.ptyxiouxoi)
    
    {
        if(p.get_klados_spoudwn().equals(ptyxio)&& p.get_titlos_diplomatikis().equals(ptyxiaki)&&p.get_vathmos_diplomatikhs()==vathmos)
            
        {
            
            result.add(p);
        }
        
    }
    
    
    return result;
}



}
