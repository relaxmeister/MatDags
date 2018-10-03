/*
 * JavaUtveckling 2018
 */

package matdags;


public abstract class Djur {
   //attribut som bara har synlighet från subklasser (i detta fall hund,katt och orm)
   protected int vikt; // i gram
   protected int portion; // i gram
   protected String namn;

   Djur(String namn, int vikt)
   {
       this.namn = namn;
       this.vikt = vikt;
   }
}
