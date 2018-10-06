/*
 * JavaUtveckling 2018
 */

package matdags;

import javax.swing.JOptionPane;


public class Orm extends Djur implements IPortionsHanteraren {
    Orm (String namn, int vikt) //bara intresserad av att ta emot namn egentligen men vem vet.. aningens mindre kod
    {
       super(namn, vikt);
    }

   public void printPortion()
   {
       //ormens portion = oberoende av vikt -> alltid 20g
       portion = 20; // i gram
       JOptionPane.showMessageDialog(null, getNamn() + " vill ha " + portion + "g ormpellets");
   }
}
