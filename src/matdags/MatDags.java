/*
 * JavaUtveckling 2018
 */

package matdags;

import javax.swing.JOptionPane;


public class MatDags {


    public static void main(String[] args) {
       // Påvisa behärskning av inkapsling och polymorfism
       // inkapsling s 391 i boken, protected är att föredra (eller inget? egentligen?)
       // kolla hennes svar på tidigare lektion

       String vilketDjur;
       //hej


       IPortionsHanteraren Sixten = new Hund("Sixten", 5000);
       IPortionsHanteraren Dogge = new Hund("Dogge", 10000);
       IPortionsHanteraren Venus = new Katt("Venus", 5000);
       IPortionsHanteraren Ove = new Katt("Ove", 3000);
       IPortionsHanteraren Hypno = new Orm("Hypno", 1000);

       vilketDjur = JOptionPane.showInputDialog("Vilket djur ska få mat?"); // anger djurets namn? Sixten direkt?

       vilketDjur = vilketDjur.toLowerCase();

       /*
       Polymorfism, ett anrop till samma metod leder till anrop till olika instansmetoder beroende
       på objektets typ, i detta fall har vi typerna Hund, Katt, Orm
        */
       switch(vilketDjur) {
           case "sixten" :
               Sixten.printPortion(); // alla dessa  hamnar under polymorfism, anrop till samma metod i olika klasser
               break;
           case "dogge" :
               Dogge.printPortion(); // i intellijay ctrl + q för att läsa doc
               break;
           case "venus" :
               Venus.printPortion(); // beviset på polymorfism är först när vi ser att det funkar för olika "typer"
               break;
           case "ove" :
               Ove.printPortion(); //t.ex hund och sedan katt
               break;
           case "hypno" :
               Hypno.printPortion();
               break;
           default : // om användaren skriver in något annat som inte stämmer överens med ovan
               JOptionPane.showMessageDialog(null, "Detta namn finns inte i databasen");
               break;

       }
    }

}
