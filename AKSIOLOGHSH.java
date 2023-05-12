
package com.mycompany.careerfinder;

import java.sql.Time;
import java.util.Date;


public class AKSIOLOGHSH {
	
	private int kodikos_aksiologhshs;
	private int kodikos_aithshs;
	private float vathmos;
	private String sxolia;
	private Date hmeromhnia_enhmerwshs;
	private Time wra_enhmerwshs;
	
	
	public AKSIOLOGHSH(int kodikos_aksiologhshs,int kodikos_aithshs, float vathmos, String sxolia, Date hmeromhnia_enhmerwshs, Time wra_enhmerwshs)
	
	{
		this.kodikos_aksiologhshs = kodikos_aksiologhshs;
		
		this.kodikos_aithshs = kodikos_aithshs;
		
		this.vathmos = vathmos;
		
		this.sxolia = sxolia;
		
		this. hmeromhnia_enhmerwshs = hmeromhnia_enhmerwshs;
		
		this.wra_enhmerwshs = wra_enhmerwshs;
		
	}
	
	
	public int get_kodikos_aksiologhshs()
            
    {
        return kodikos_aksiologhshs;
    }
    
    public void set_kodikos_aksiologhshs(int kodikos_aksiologhshs)
            
    {
        this.kodikos_aksiologhshs = kodikos_aksiologhshs;
    }
	
	
	
	public int get_kodikos_aithshs()
            
    {
        return kodikos_aithshs;
    }
    
    public void set_kodikos_aithshs(int kodikos_aithshs)
            
    {
        this.kodikos_aithshs = kodikos_aithshs;
    }
    
    public float get_vathmos()
            
    {
        return vathmos;
    }
    
    public void set_vathmos(float vathmos)
            
    {
        this.vathmos = vathmos;
    }		
	
	
	
	public String get_sxolia()
            
    {
        return sxolia;
    }
    
    public void set_sxolia(String sxolia)
            
    {
        this.sxolia = sxolia;
    }			
	
	
	public Date get_hmeromhnia_enhmerwshs()
            
    {
        return hmeromhnia_enhmerwshs;
    }
    
    public void set_hmeromhnia_enhmerwshs(Date hmeromhnia_enhmerwshs)
            
    {
        this.hmeromhnia_enhmerwshs = hmeromhnia_enhmerwshs;
    }				
	
	
	
	
	public Time get_wra_enhmerwshs()
            
    {
        return wra_enhmerwshs;
    }
    
    public void set_wra_enhmerwshs(Time wra_enhmerwshs)
            
    {
        this.wra_enhmerwshs = wra_enhmerwshs;
    }				
		
}
