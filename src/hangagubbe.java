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
            int teslän, intnum;
            teslän = bokstiSt.length();
            System.out.println(teslän + "0");
            if (teslän == 1){
                System.out.println("1");
                try {
                    intnum = Integer.parseInt(bokstiSt);
                } catch (NumberFormatException e) {
                    gisboks = bokstiSt.charAt(0);
                    System.out.println("2");
                    intnum = 0;
                    BokstGis = false;
                }
            }
            System.out.println("3");
            if (BokstGis = true) {
                JOptionPane.showMessageDialog(null, "Du har skrivit antingen flera bokstäver eller en sifra! \n Försök igen...");
            }
        }
        System.out.println(gisboks);
    }

    private static String ordslumpare() {
        String[] ordind = {"ett", "java", "faxe"};


        String ord = "faxe";
        return ord;
    }
}
