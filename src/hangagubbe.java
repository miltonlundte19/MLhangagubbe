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
        char gisboks;
        String bokstiSt;
        Boolean BokstGis = true;
        while (BokstGis){
            bokstiSt = JOptionPane.showInputDialog("Gisa på en bokstav (får inte vara en sifra)");
            int teslän, intnum;
            teslän = bokstiSt.length();
            if (teslän == 1){

            }
        }
    }

    private static String ordslumpare() {
        String[] ordind = {"ett", "java", "faxe"};


        String ord = "faxe";
        return ord;
    }
}
