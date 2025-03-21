package com.drivehub.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Formats {
    public static Date dateFormat(String input) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date utilDate = formatter.parse(input);
        return new Date(utilDate.getTime());
    }

    public static Timestamp dateTimeFormat(String input) {
        LocalDateTime localDateTime = LocalDateTime.parse(input);
        return Timestamp.valueOf(localDateTime);
    }

    public static String regNumberFormat(String oldNumber, String userType, int digit) {
        String pattern = "%0"+digit+"d";
        int num = Integer.parseInt(oldNumber.replaceFirst(userType, "")) + 1;
        return  userType+String.format(pattern, num);
    }
}
