package hosok;
/*
3.feladat
Írj egy Bosszuallo absztrakt osztályt, ami implementálja a Szuperhos interfészt.
 Az osztály a következő private láthatóságú adattagokkal rendelkezik: egy lebegőpontos szuperero, és egy
logikai vanEGyengesege.
 Az osztály rendelkezzen paraméteres konstruktorral, ami beállítja az adattagokat. 
Szoftverfejlesztés gyakorlat – 11. óra 2019.11.11.
11
 Legyen egy public megmentiAVilagot absztrakt metódusa, ami egy logikai értékkel tér vissza. Valósítsd meg
továbbá az interfész metódusait. Az erő lekérdezésekor add vissza a Bosszuallo szupererejét. Egy Bosszuallo
egy Bosszuallo szuperhőst akkor tud legyőzni, ha annak van gyengesége, és ereje kisebb, mint az övé.
Batman-t csak akkor tudja legyőzni, ha ereje kétszer nagyobb.
 Az osztálynak legyen továbbá getter és setter metódusa az adattagjaihoz, és legyen szöveges formára
alakítható, kiírva az adattagok értékét.
*/

public abstract class Bosszuallo implements Szuperhos{
    private double szuperero;
    private boolean  vanEGyengesege;
    
    public abstract boolean megmentiAVilagot();
        
    @Override
    public double mekkoraAzEreje() {
        return this.szuperero;
    }
    
    @Override
    public boolean legyoziE(Szuperhos szuperhos)
    {
        if (vanEGyengesege==true && szuperero > szuperhos.mekkoraAzEreje()) {
            return true;
        }
        else{
            return false;
        }
    }
   
    public double getSzuperero() {
        return szuperero;
    }

    public boolean getVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }
    

    @Override
    public String toString() {
        return String.format("Szuperero: %f  - Gyengesége van-e: %f",this.szuperero,this.vanEGyengesege);
    }      
}
