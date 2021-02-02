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
        ArrayList<String> gisadebokstäver = new ArrayList<String>();
        while (true) {
            BokstGis = true;
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
            int g = gisadebokstäver.size();
            if (g == 0) {
                gisadebokstäver.add(gisboks);
                System.out.println("1");
            } else {
                System.out.println("2");
                int b = bokskontstor(gisadebokstäver, gisboks);
                if (b == 1) {
                    System.out.println("3");
                    JOptionPane.showInputDialog(null, "Du har redan gisat på det.");
                }else if (b == 0){
                    System.out.println("4");
                    gisadebokstäver = addbokstav(gisadebokstäver,gisboks);
                }
            }
            System.out.println(gisadebokstäver);
        }

    }

    private static ArrayList<String> addbokstav(ArrayList<String> gisadebokstäver, String gisboks) {
        gisadebokstäver.add(gisboks);
        return gisadebokstäver;
    }

    private static int bokskontstor(ArrayList<String> gisadebokstäver, String gisboks) {
        int i = gisadebokstäver.size();
        int n = 1;
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
