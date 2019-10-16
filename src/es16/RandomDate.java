package es16;

import java.time.LocalDateTime;
import java.util.Random;

public class RandomDate {

    private static Random random= new Random();


    public static LocalDateTime creaData(){
        int giorno = 1+random.nextInt(28);
        int mese = 1 + random.nextInt(12);
        int anno = 2015 + random.nextInt(7);
        int ora = random.nextInt(24);
        int minuti = random.nextInt(60);
        return LocalDateTime.of(anno,mese,giorno,ora,minuti);
    }
}// end Class
