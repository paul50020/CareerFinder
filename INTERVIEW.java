
package com.mycompany.careerfinder;

import java.sql.Time;
import java.util.Date;

public class INTERVIEW {
    
    private int id;
    private String username_ipeuthinou;
    private String username_ptuxiouxou;
    private Date date;
    private Time time;

public INTERVIEW(int id, String username_ipeuthinou, String username_ptuxiouxou,Date date,Time time)
    {
        this.id = id;

        this.username_ipeuthinou = username_ipeuthinou;

        this.username_ptuxiouxou = username_ptuxiouxou;

        this.date = date;

        this.time = time;
    }

public int get_id()
    {
        return id;
    }

public void set_id(int id)
    {
        this.id = id;
    }

public String get_username_ipeuthinou()
    {
        return username_ipeuthinou;
    }

public void set_username_ipeuthinou(String username_ipeuthinou)
    {
        this.username_ipeuthinou = username_ipeuthinou;
    }

public String get_username_ptuxiouxou()
    {
        return username_ptuxiouxou;
    }

public void set_username_ptuxiouxou(String username_ptuxiouxou)
    {
        this.username_ptuxiouxou = username_ptuxiouxou;
    }

public Date get_date()
    {
        return date;
    }

public void set_date(Date date)
    {
        this.date = date;
    }

public Time get_time()
    {
        return time;
    }

public void set_time(Time time)
    {
        this.time = time;
    }

}
