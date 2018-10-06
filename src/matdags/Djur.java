/*
 * JavaUtveckling 2018
 */

package matdags;


public abstract class Djur {
   //attribut som bara har synlighet från subklasser (i detta fall hund,katt och orm)
   private int vikt; // i gram
   protected int portion; // i gram
   private String namn;

   Djur(String namn, int vikt)
   {
       this.namn = namn;
       this.vikt = vikt;
   }
   public String getNamn()
   {
       return this.namn;
   }
   public int getVikt()
   {
       return this.vikt;
   }
}
