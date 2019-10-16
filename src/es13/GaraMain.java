package es13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GaraMain {

    public static void main(String[] args) {
        List<Auto> corridori = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            corridori.add(new Auto("Marca"+i ,"Pilota"+i));
        }

        for (int i = 0; i < 52; i++) {
            for (Auto a:corridori) {
                a.gara(102000);
            }
        }

        Collections.sort(corridori);

        for (Auto a:corridori) {
            System.out.println(a);
        }
    }//end main
}// end Class
