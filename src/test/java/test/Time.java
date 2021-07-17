package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm a");
        Date formattedDate=formatter.parse("");
        String s=formatter.format(formattedDate);
        Date date = new Date();
    }
}
