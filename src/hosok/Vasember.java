package hosok;
/*
4.feladat
Írj egy Vasember osztályt, ami a Bosszuallo leszármazottja, és megvalósítja a Milliardos interfészt.
 Az osztálynak egy default konstruktora legyen, ami beállítja a Vasember tulajdonságait. A Vasember
szuperereje 150, és van gyengesége.
 Ha a Vasember kütyüt készít, akkor szuperereje nőjön ereje egy 0-10 közötti véletlenszerű lebegőpontos
számmal.
 A Vasember akkor menti meg a világot, ha a szuperereje nagyobb, mint 1000.
 Az osztály legyen továbbá szöveges formára alakítható. Az adattagok értékein kívül írja ki azt is, hogy a
Vasemberről van szó.
*/

import java.util.Random;

public class Vasember extends Bosszuallo implements Milliardos{

    public Vasember() {
        super.setSzuperero(150); 
        super.setVanEGyengesege(true);
    }
    @Override
    public boolean megmentiAVilagot()
    {
        if (mekkoraAzEreje() > 1000)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public void kutyutKeszit()
    {
        Random rnd = new Random();
        setSzuperero(mekkoraAzEreje() + rnd.nextDouble() * 10);
    }

    @Override
    public String toString() {
        return String.format("%s - ereje: %d, van-e gyengesége: %b", this.getClass().getSimpleName(), mekkoraAzEreje(), getVanEGyengesege());
    }

    
    
}
