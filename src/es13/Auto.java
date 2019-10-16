package es13;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class Auto implements Comparable<Auto>{

    private String modello;
    private String nomePilota;
    private Duration tempDiCorsa;
    private Random random;

    public Auto(String modello, String nomePilota) {
        this.modello = modello;
        this.nomePilota = nomePilota;
        this.tempDiCorsa = Duration.ZERO;
        this.random = new Random();
    }


    public void gara(long tempoMedioaGiroMillisec){
        boolean velocità = random.nextBoolean();
        int rdTime = random.nextInt(2000);
        long tmAgiro = 0;
        if(velocità){
           tmAgiro = tempoMedioaGiroMillisec + rdTime;
        }else {
            tmAgiro = tempoMedioaGiroMillisec - rdTime;
        }
        tempDiCorsa = tempDiCorsa.plus(tmAgiro, ChronoUnit.MILLIS);
    }

    private String formatTime(Duration duration){
        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("HH:mm:ss:SSSS");
        LocalTime localTime = LocalTime.of(0,0,0,0);
        localTime = localTime.plus(duration);
        String timeStr = formatter.format(localTime);
        return timeStr;
    }

    @Override
    public String toString() {
        return "Auto" + " " + modello +
                " " + nomePilota + "\n"+
                " tempDiCorsa= " + formatTime(tempDiCorsa);
    }

    public Duration getTempDiCorsa() {
        return tempDiCorsa;
    }

    @Override
    public int compareTo(Auto o) {
        return this.getTempDiCorsa().compareTo(o.getTempDiCorsa());
    }
}// end Class
