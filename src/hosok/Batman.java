package hosok;
/*
5.feladat
rj egy Batman osztályt, ami implementálja a Szuperhos és Milliardos interfészeket.
 Az osztálynak legyen egy lebegőpontos lelemenyesseg adattagja.
 Az osztály rendelkezzen egy default konstruktorral, ami 100-ra állítja az adattag értékét. A metódusai az
alábbiak szerint legyenek megvalósítva: Batman ereje a leleményességének kétszeresével egyezik meg, és
bármilyen Szuperhőst képes legyőzni, akinek ereje kisebb, mint Batman leleményessége. Ha Batman kütyüt
készít, akkor a leleményessége 50-el nő.
 Az osztály legyen szöveges formára alakítható, ami kiírja, hogy Batmanről van szó, és megadja a
leleményességét.
*/
public class Batman implements Szuperhos, Milliardos{
    private double lelemenyesseg;

    public Batman(double lelemenyesseg) {
        this.lelemenyesseg = 100;
    }
    
    @Override
    public void kutyutKeszit() {
        lelemenyesseg += 50;
    }
    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        if (szuperhos.mekkoraAzEreje() < lelemenyesseg)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    @Override
    public double mekkoraAzEreje() {
        return lelemenyesseg * 2;
    }
    @Override
    public String toString() {
        return String.format("%s - leleményessége: %d", this.getClass().getSimpleName(), lelemenyesseg);
    }
    
}
