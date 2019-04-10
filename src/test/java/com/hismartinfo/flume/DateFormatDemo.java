package com.hismartinfo.flume;

import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;
import org.apache.commons.lang.time.FastDateFormat;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd HH:mm:ss yyyy", new Locale("en"));
        Date parse = simpleDateFormat.parse("Apr 10 02:55:54 2019");
        System.out.println(parse);


        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse1 = simpleDateFormat1.parse("2019-3-28 16:50:6");
        System.out.println(parse1);



    }

}
