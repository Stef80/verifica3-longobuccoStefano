package es14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TrovaGiorni {

   private LocalDate annoBisestile;
   private List<Integer> anniBis;

   public TrovaGiorni(){
       this.annoBisestile = LocalDate.of(1970,1,1);
       this.anniBis = new ArrayList<>();
   }


   public void trovaAnnoBisestile(int annoDiInizio,int annoDiFine){
       LocalDate local = null;
       int range = annoDiFine-annoDiInizio;
       for (int i = 0; i < range; i++) {
         local =  annoBisestile.plus(i, ChronoUnit.YEARS);
         if(local.isLeapYear()){
             anniBis.add(local.getYear());
         }
       }
   }

   public List<String> trovaGiorno(int giorno , int mese){
       LocalDate local = null;
       List<String>  giorni= new ArrayList<>();
       for (int i = 0; i < anniBis.size(); i++) {
           int anno = anniBis.get(i);
           String gi = LocalDate.of(anno, mese, giorno).
                   format(DateTimeFormatter
                           .ofPattern("EEEE", Locale.getDefault()));
           String giornoAnno= gi + " è il giorno della settimana del " +giorno+"/"+mese+"/"+anno;
           giorni.add(giornoAnno);

       }
        return giorni;
   }

}// end Class
