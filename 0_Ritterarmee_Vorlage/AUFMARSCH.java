public class AUFMARSCH extends SPIEL
{
    int zaehler = 0;
    RITTER[] armee;

    public AUFMARSCH(){
        zaehler++;
        armee = new RITTER[8];
        super.starteTickerNeu(1);
    }

    public void aufmarschieren(){
    }

    public void aufruecken(){

    }

    public void einordnen(RITTER ritter){

    }
    public int freiePositioinFinden(){

        return 1;
    }

    @Override
    public void tick() {
    }
}
