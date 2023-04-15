package org.geekster;

import java.time.LocalDate;
import java.util.Date;

public class MailConstants {

    public static final String SENDER = "saininikhilnnn@gmail.com";
    public static final String RECEIVER = "sainisaininnn@gmail.com";

    //Subject of the mail
    public static final String SUBJECT = "Testing Java Mail App on "+ LocalDate.now();
    //Message to be sent in the mail body
    public static final String MESSAGE = "This mail is sent by Nikhil through Java Application at "+new Date()+".";

}
