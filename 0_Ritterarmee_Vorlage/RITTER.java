public class RITTER
extends FIGUR
{
     String name;
     public RITTER(double x, int y, String bild, String n)
     {
          super(bild);
          name = n;

     }

     public void marschieren(double schritte){
          verschiebenUm(schritte,0);
     }

     public String nenneName(){
         return name;
     }
}
