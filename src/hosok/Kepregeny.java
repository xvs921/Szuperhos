package hosok;
/*
6.feladat
Írj egy Kepregeny nevű futtatható osztályt. Az osztály rendelkezzen egy szereplok statikus függvénnyel, ami egy fájl
elérési útját várja paraméterül, visszatérése pedig void. A metódus feladata, hogy a fájlból beolvasott sorokat
feldolgozza, és létrehozzon belőlük Batman, vagy Vasember objektumpéldányokat, majd ezekre meghívja a
kutyutKeszit metódust annyiszor, ahányszor az aktuális sor írja. Ezeket egy közös kollekcióban tárold le.
Készíts továbbá egy szuperhosok statikus metódust, ami végigmegy a tárolóban tárolt szuperhősökön, és kiírja őket.
Hívd meg a main függvényben sorban a fenti két metódust. Minden esetleges kivételt (főleg: IOException) kezelj le
vagy kivétel specifikációval, vagy try blokkban!
Egy minta fájl felépítése az alábbi:
Vasember 5
Batman 8
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Kepregeny {
    public static List<Szuperhos> szuperhosok;

    public static void szereplok(String fajlnev)
    {
        try
        {
            szuperhosok = new ArrayList<>();
            FileReader fr = new FileReader(fajlnev);
            BufferedReader br = new BufferedReader(fr);
            String sor = br.readLine();
            while (sor != null)
            {
                String[] st = sor.split(";");
                if (st[0].equals("Vasember"))
                {
                    Vasember vasember = new Vasember();
                    for (int i = 0; i < Integer.parseInt(st[1]); i++)
                    {
                        vasember.kutyutKeszit();
                    }
                    szuperhosok.add(vasember);
                }
                else
                {
                    Batman batman = new Batman();
                    for (int i = 0; i < Integer.parseInt(st[1]); i++)
                    {
                        batman.kutyutKeszit();
                    }
                    szuperhosok.add(batman);
                }
                sor = br.readLine();
            }
            fr.close();
            br.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Nem található a fájl!");
        }
        catch (IOException e)
        {
            System.out.println("Jogosultsági hiba!");
        }
    }
    public static void szuperhosok()
    {
        for (Szuperhos s : szuperhosok)
        {
            System.out.println(s);
        }
    }
    public static void main(String[] args)
    {
        szereplok("fajl.txt");
        szuperhosok();
    }
}
