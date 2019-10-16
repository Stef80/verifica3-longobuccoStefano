package es16;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Agenda {
    private List<Appuntamento> listaAppuntamenti;

    public Agenda(){
        listaAppuntamenti = new ArrayList<>();
    }

    public boolean aggiungiAppuntamento(LocalDateTime inizio , LocalDateTime fine, String descrizione){
        Appuntamento appun = new Appuntamento(inizio, fine, descrizione);
        if(!listaAppuntamenti.contains(appun)){
            listaAppuntamenti.add(appun);
            return true;
        }
        return false;
    }

    public boolean aggiungiPromemoria(LocalDateTime inizio , String descrizione){
        Appuntamento appun = new Appuntamento(inizio, null, descrizione);
        if(!listaAppuntamenti.contains(appun)){
            listaAppuntamenti.add(appun);
            return true;
        }
        return false;
    }

    public Appuntamento trovaAppuntamento(LocalDateTime data){
        for (Appuntamento a:listaAppuntamenti) {
            if(a.getInizio().equals(data)){
                return a;
            }
        }
        System.out.println("Appuntamento in data"+ data + "non trovato");
        return null;
    }

    public String listaAppuntamenti(){
        String tmp = "";
        Collections.sort(listaAppuntamenti);
        for (Appuntamento a:listaAppuntamenti) {
            tmp += a.toString()+ "\n";
        }
      return tmp;
    }

    public String stampaAppuntamentiMese(int mese, int anno){
        if(mese< 0 || mese >12){
            throw new IllegalAppointmentException();
        }
        Collections.sort(listaAppuntamenti);
        String tmp = "";
        for (Appuntamento a:listaAppuntamenti) {
            if(a.getInizio().getMonthValue()==mese && a.getInizio().getYear() == anno)
            tmp += a.toString() + "\n";
        }
        return tmp;
    }


    public String stampaAppuntamentiGirono(int giorno , int mese , int anno){
        if(mese< 0 || mese >12){
            throw new IllegalAppointmentException();
        }
        Collections.sort(listaAppuntamenti);
        String tmp = "";
        for (Appuntamento a:listaAppuntamenti) {
            if(a.getInizio().getMonthValue() == mese && a.getInizio().getYear() == anno && a.getInizio().getDayOfMonth()== giorno )
                tmp += a.toString() + "\n";
        }
        return tmp;
    }

    public String stampaAppuntamentiAnno(int anno){
        Collections.sort(listaAppuntamenti);
        String tmp = "";
        for (Appuntamento a:listaAppuntamenti) {
            if( a.getInizio().getYear() == anno )
                tmp += a.toString() + "\n";
        }
        return tmp;

    }
//
//    public LocalTime calcolaDurata(LocalDateTime inizio, LocalDateTime fine){
//        int ore = fine.getHour()-inizio.getHour();
//        int minuti = fine.getMinute()-inizio.getMinute();
//        return LocalTime.of(ore,minuti,0) ;
//    }




    private class Appuntamento implements Comparable<Appuntamento>{

        private LocalDateTime inizio;
        private LocalDateTime fine;
        private String descrizione;
        private boolean completato;

        public Appuntamento(LocalDateTime inizio, LocalDateTime fine, String descrizione) {
            this.inizio = inizio;
            this.fine = fine;
            this.descrizione = descrizione;
            this.completato = false;
            isAppuntamento();
            setCompletato();
        }

        public boolean isAppuntamento(){
            if(fine != null){
                return true;
            }
            return false;
        }


        public void setCompletato() {
            if(isAppuntamento() && fine.compareTo(LocalDateTime.now())<0 || !isAppuntamento() && inizio.compareTo(LocalDateTime.now())<0 )
            this.completato = true;
        }


        public LocalDateTime getInizio() {
            return inizio;
        }

        private String formattaData(LocalDateTime dateTime){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            return formatter.format(dateTime);
        }

        @Override
        public String toString() {
            if(isAppuntamento()){
            return "Appuntamento in data" +
                    "inizio " + formattaData(inizio) +
                    ", fine=" + formattaData(fine) +
                //    "durata " + calcolaDurata(inizio,fine)+
                    ", descrizione='" + descrizione + '\'' +
                    ", completato=" + completato ;
        }else
            return "Promemoria " +
                    "data " + formattaData(inizio) +
                    ", descrizione='" + descrizione + '\'' +
                    ", completato=" + completato ;
        }

        @Override
        public int compareTo(Appuntamento o) {
            return this.getInizio().compareTo(o.getInizio());
        }
    }



}// end Class
