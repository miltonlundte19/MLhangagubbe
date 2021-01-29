import javax.swing.*;

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
        char gisboks = ' ';
        String bokstiSt;
        Boolean BokstGis = true;
        while (BokstGis){
            bokstiSt = JOptionPane.showInputDialog("Gisa på en bokstav (får inte vara en sifra)");
            gisboks = bokstkonverter(bokstiSt);
            if (gisboks != ' ') {
                BokstGis = false;
            } else {
                JOptionPane.showMessageDialog(null, "Du har skrivit antingen flera bokstäver eller en sifra! \n Försök igen...");
            }

        }
        System.out.println(gisboks);
    }

    private static char bokstkonverter(String bokstiSt) {
        int i = bokstiSt.length();
        int n;
        int m = 1;
        char b = bokstiSt.charAt(0);
        if (i == 1) {
            try {
                n = Integer.parseInt(bokstiSt);
            } catch (NumberFormatException e) {
                m = 5;
                n = 0;
            }
        }
        if (m == 1){
            b = ' ';
        }
        return b;
    }

    private static String ordslumpare() {
        String[] ordind = {"ett", "java", "faxe"};


        String ord = "faxe";
        return ord;
    }
}
