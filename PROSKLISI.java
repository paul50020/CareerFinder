
package com.mycompany.careerfinder;

import java.sql.Time;
import java.util.Date;


public class PROSKLISI {
    
    private int id;

    private String username_apostolea;

    private String username_paralipti;

    private String thema;

    private String minima;

    private Date date;

    private Time time;

public PROSKLISI(int id, String username_apostolea, String username_paralipti, String minima, String thema, Date date, Time time)
    {
        this.id = id;

        this.username_apostolea = username_apostolea;

        this.username_paralipti = username_paralipti;

        this.minima = minima;

        this.thema = thema;

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

public String get_minima()
    {
        return minima;
    }

public void set_minima(String minima)
    {
        this.minima = minima;
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
