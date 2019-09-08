package com.studio.faisal.uangkas.helper;

import java.util.Calendar;

/**
 * Created by Faisal on 22/04/2019.
 */

public class CurrentDate {
    public static Calendar calendar = Calendar.getInstance();
    public static int year = calendar.get(Calendar.YEAR);
    public static int month = calendar.get(Calendar.MONTH);
    public static int day = calendar.get(Calendar.DAY_OF_MONTH); // current day
}
