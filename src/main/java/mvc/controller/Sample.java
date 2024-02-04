package mvc.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Sample {

    public static void main(String[] args) {
        Date d = new Date();

        SimpleDateFormat sf = new SimpleDateFormat("yyyy*****MM*****dd");

        String format = sf.format(d);
        System.out.println(format);

    }

}
