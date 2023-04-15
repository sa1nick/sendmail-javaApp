package org.geekster;

import java.sql.Time;
import java.time.LocalDate;
import java.util.Timer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Prepare to send mail
        System.out.println("This application is supposed to send mails on "+ LocalDate.now());

        HandleMail emailer = new HandleMail();
        emailer.sendMail();
    }
}