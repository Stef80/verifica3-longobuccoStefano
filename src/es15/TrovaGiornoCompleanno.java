package es15;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TrovaGiornoCompleanno {


    public static String find(int day, int month, int year, String language) {
        String giorno = LocalDate.of(year, month, day).
                format(DateTimeFormatter
                        .ofPattern("EEEE", Locale
                                .forLanguageTag(language)));
        return giorno;
    }


    public static void main(String[] args) {
        int annoDiNascita = 1980;
        int annoDiRange = 2036;

        for (int i = 0; i <= annoDiRange-annoDiNascita; i++) {
            System.out.println(find(26,10,annoDiNascita+i,"it")+ " "+ (annoDiNascita+i));
            System.out.println(find(26,10,annoDiNascita+i,"en"));
            System.out.println("\n");
        }
    }//end main
}// end Class
