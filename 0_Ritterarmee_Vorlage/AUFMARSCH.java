import java.util.Random;
public class AUFMARSCH extends SPIEL
{
    int zaehler = 0;
    RITTER[] armee;

    int freePos;

    public AUFMARSCH(){
        super(960,540);
        zaehler++;
        this.armee = new RITTER[8];
        super.starteTickerNeu(1);
        super.setzeHintergrundgrafik("wiese.jpg");
    }

    public void aufmarschieren(){
    }

    public void aufruecken(){
        
    }

    public void einordnen(RITTER ritter){
        //TODO: ncit marscheieren sondern beim aufstellen die pos machen und dann beim aufruecken erst marschieren
            //ritter.marschieren(2);
        ritter.setzeMittelpunkt(-20, -4);
        ritter.animiereGerade(0.75, -14 + (freePos*4), -4, false);
        //ritter.marschieren(-11 + ((freePos)*4));

        System.out.println("Ritter "+ ritter.name + " marschiert auf Position " + freePos);
    }

    public int freiePositionFinden(){
        //System.out.println("armee länge" +armee.length);
        for (int i = 0; i < armee.length; i++) {
            //System.out.println("werde ausgefuehrt");
            if (armee[i] == null) continue;
            return i - 1;
        }
            return 7;
    }

    @Override
    public void tick(){
        String nBild = "";
        Random rand = new Random();
        int zufallszahl = rand.nextInt(4);
        switch (zufallszahl) {
            case 0 -> nBild = "ritter_1.png";
            case 1 -> nBild = "ritter_2.png";
            case 2 -> nBild = "ritter_3.png";
            case 3 -> nBild = "ritter_4.png";
        }
        String nName = "Olaf"+zaehler;

        //System.out.println(armee[3]);
        //System.out.println(freiePositionFinden());

        this.freePos = freiePositionFinden();
        if (freePos > -1) {
            armee[freePos] = new RITTER(-3, -4, nBild, nName);
            einordnen(armee[freePos]);
        }
        zaehler++;
    }
}
