package es16;

import javax.print.attribute.standard.PrinterMakeAndModel;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class MainAgenda {

    public static void main(String[] args) {

        Persona io = new Persona("io","mio");
        Random r = new Random();

        for (int i = 0; i <100 ; i++) {

            io.creaPromemoria(RandomDate.creaData(),"promemoria"+i);
        }
        for (int i = 0; i < 100; i++) {
            LocalDateTime dataI= RandomDate.creaData();
            LocalDateTime dataF = dataI.plus(r.nextInt(21), ChronoUnit.HOURS);
            io.creaAppuntamento(dataI,dataF ,"appuntamento"+i);
        }

        System.out.println(io.interrogaAgenda());
        System.out.println("");
        System.out.println(io.interrogaAgendaPerMese(10,2018));
        System.out.println("");
        System.out.println(io.interrogaAgendaPerAnno(2019));



    }//end main
}// end Class
