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
       portion = getVikt() / 100; //antar att jag skulle kunna köra en getVikt från djur osv...
       JOptionPane.showMessageDialog(null, getNamn() + " vill ha " + portion + "g hundfoder");
    }
}
