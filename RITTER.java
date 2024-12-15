public class RITTER extends FIGUR implements DATENELEMENT
{
     String name;
     public RITTER(double x, int y, String bild, String n)
     {
          super(bild);
          name = n;
          super.setzeMittelpunkt(x, y);

     }

     public void marschieren(double schritte){
          verschiebenUm(schritte,0);
     }

     public String nenneName(){
         return name;
     }

     @Override
     public String InformationAusgeben() {
          return this.name;
     }

     @Override
     public boolean IstKleinerAls(DATENELEMENT dvergleich) {
          return this.name.compareTo(dvergleich.InformationAusgeben()) < 0;
     }
}
