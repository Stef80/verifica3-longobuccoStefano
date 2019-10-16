package es16;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.List;

public class Persona {

    private String nome;
    private String cognome;
    private Agenda miaAgenda;

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.miaAgenda = new Agenda();
    }

    public void creaAppuntamento(LocalDateTime inizio , LocalDateTime fine, String descrizione){
        if(inizio.compareTo(fine)> 0){
            throw new IllegalAppointmentException();
        }
        boolean creato = miaAgenda.aggiungiAppuntamento(inizio, fine, descrizione);
        if(creato){
            System.out.println("appuntamento creato");
        }else {
            System.out.println("appunta non creato forse la data è già occupata");
        }
    }

    public void creaPromemoria(LocalDateTime inizio,String descrizione){
        boolean creato =   miaAgenda.aggiungiPromemoria(inizio,descrizione);
        if(creato){
            System.out.println("promemoria creato");
        }else {
            System.out.println("promemoria non creato forse la data è già occupata");
        }
    }

    public String interrogaAgendaPerMese(int mese, int anno){
        return miaAgenda.stampaAppuntamentiMese(mese, anno);

    }

    public String interrogaAgendaPerGiorno(int giorno, int mese,int anno){
        return miaAgenda.stampaAppuntamentiGirono(giorno, mese, anno);
    }

    public String interrogaAgendaPerAnno(int anno){
        return miaAgenda.stampaAppuntamentiAnno(anno);
    }

    public String interrogaAgenda(){
        return miaAgenda.listaAppuntamenti();
    }







}// end Class
