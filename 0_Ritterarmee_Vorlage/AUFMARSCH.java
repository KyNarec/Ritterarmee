import java.util.Random;
public class AUFMARSCH extends SPIEL
{
    int zaehler = 0;
    RITTER[] armee;

    public AUFMARSCH(){
        super(960,540);
        zaehler++;
        armee = new RITTER[8];
        super.starteTickerNeu(1);
        super.setzeHintergrundgrafik("wiese.jpg");
    }

    public void aufmarschieren(){
    }

    public void aufruecken(){

    }

    public void einordnen(RITTER ritter){
        int pos = freiePositionFinden();
        //TODO: Abstand soll 2 sein
            ritter.marschieren(pos*2);
            System.out.println("Ritter "+ ritter.name + " marschiert auf Position " + pos);
    }

    public int freiePositionFinden(){
        for (int i = 0; i < armee.length; i++) {
            if (armee[i] != null && i > 1) {
                return i;
            }
        }
        return 0;
    }

    @Override
    public void tick(){
        String nBild = "";
        Random rand = new Random();
        int zufallszahl = rand.nextInt(4);
        switch (zufallszahl){
            case 0:
                nBild = "ritter_1.png";
                break;
            case 1:
                nBild = "ritter_2.png";
                break;
            case 2:
                nBild = "ritter_3.png";
                break;
            case 3:
                nBild = "ritter_4.png";
                break;
        }
        String nName = "Olaf"+zaehler;

        System.out.println(armee[3]);
        System.out.println(freiePositionFinden());

            int freePos = freiePositionFinden();
            armee[freePos] = new RITTER(-3,-4,nBild,nName);
            einordnen(armee[freePos]);

        zaehler++;
    }
}
