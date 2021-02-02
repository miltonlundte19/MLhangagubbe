import javax.swing.*;
import java.util.ArrayList;

public class hangagubbe {
    public static void main(String[] args) {
        String ord = ordslumpare();
        int ordlän = ord.length();
        String blanord = "_";
        int k;
        //System.out.println(ordlän);
        for (k=1;k!=ordlän;k++){
            blanord = blanord + " _";
        }
        //JOptionPane.showMessageDialog(null, ord + "\n" + blanord);
        String gisboks = " ";
        String bokstiSt;
        Boolean BokstGis = true;
        while (true) {
            while (BokstGis) {
                bokstiSt = JOptionPane.showInputDialog("Gisa på en bokstav (får inte vara en sifra)");
                gisboks = bokstkonverter(bokstiSt);
                if (!gisboks.equals(" ")) {
                    BokstGis = false;
                } else {
                    JOptionPane.showMessageDialog(null, "Du har skrivit antingen flera bokstäver eller en sifra! \n Försök igen...");
                }

            }
//        System.out.println(gisboks);
            ArrayList<String> gisadebokstäver = new ArrayList<String>();
            int g = gisadebokstäver.size();
            if (g == 0) {
                gisadebokstäver.add(gisboks);
            } else {

                if (bokskontstor(gisadebokstäver, gisboks) == 1) {
                    JOptionPane.showInputDialog(null, "fungerar.");
                }
            }
        }

    }

    private static int bokskontstor(ArrayList<String> gisadebokstäver, String gisboks) {
        int i = gisadebokstäver.size();
        int n = 0;
        int b = 0;
        String s;
        while (true) {
            for (n = 0; n == i; n++) {
                s = gisadebokstäver.get(n);
                if (s.equalsIgnoreCase(gisboks)) {
                    b = 1;
                    break;
                }
            }
            if (n == i){
                break;
            }
        }
        return b;
    }

    private static String bokstkonverter(String bokstiSt) {
        int i = bokstiSt.length();
        int n;
        int m = 1;
        String b = String.valueOf(bokstiSt.charAt(0));
        if (i == 1) {
            try {
                n = Integer.parseInt(bokstiSt);
            } catch (NumberFormatException e) {
                m = 5;
                n = 0;
            }
        }
        if (m == 1){
            b = " ";
        }
        return b;
    }

    private static String ordslumpare() {
        String[] ordind = {"ett", "java", "faxe"};


        String ord = "faxe";
        return ord;
    }
}
