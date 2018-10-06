/*
 * JavaUtveckling 2018
 */

package matdags;

import javax.swing.JOptionPane;


public class Katt extends Djur implements IPortionsHanteraren {
   Katt (String namn, int vikt)
   {
       super(namn, vikt);
   }

   public void printPortion()
   {
       //kattens vikt(g) / 150 = vikten på portionen
       portion = getVikt()/100;
       JOptionPane.showMessageDialog(null, getNamn() + " vill ha " + portion + "g kattfoder");
   }
}
