package es14;

import java.util.ArrayList;
import java.util.List;

public class MainTrovaGiorno {

    public static void main(String[] args) {
        TrovaGiorni trova = new TrovaGiorni();
        List<String> compleanno = new ArrayList<>();
        List<String> feb29 = new ArrayList<>();
        List<String> ferragosto = new ArrayList<>();
        List<String> natale = new ArrayList<>();
        List<String> capodanno = new ArrayList<>();

        trova.trovaAnnoBisestile(1970,2038);
        compleanno = trova.trovaGiorno(26,10);
        feb29 = trova.trovaGiorno(29,2);
        ferragosto = trova.trovaGiorno(15,8);
        natale = trova.trovaGiorno(25,12);
        capodanno = trova.trovaGiorno(1,1);

        for (int i = 0; i < compleanno.size() ; i++) {
            if(compleanno.get(i).endsWith("1972") || compleanno.get(i).endsWith("1976")){
                System.out.println(feb29.get(i)+ "\n"+ ferragosto.get(i) + "\n"+ natale.get(i) +
                        "\n"+ capodanno.get(i));
            System.out.println("\n#################################\n");}else {
                System.out.println(compleanno.get(i) + "\n" + feb29.get(i) + "\n" + ferragosto.get(i) + "\n" + natale.get(i) +
                        "\n" + capodanno.get(i));
                System.out.println("\n#################################\n");
            }
        }

    }//end main


}// end Class
