package com.veterinaria.demo.utilities;

import java.sql.Timestamp;
import java.util.Date;

public class Utilities {
   
    public static Timestamp getCurrentTimestamp() {
        Date date = new Date();
        return new Timestamp(date.getTime());
     }
}
