/*
 * JavaUtveckling 2018
 */

package matdags;

import javax.swing.JOptionPane;


public class Hund extends Djur implements IPortionsHanteraren {

    Hund (String namn, int vikt)
    { 
       super(namn, vikt);
    }

    public void printPortion() {

       //hundens vikt(g) / 100 = vikten på portionen
       portion = vikt / 100;
       JOptionPane.showMessageDialog(null, namn + " vill ha " + portion + "g hundfoder");
    }
}
