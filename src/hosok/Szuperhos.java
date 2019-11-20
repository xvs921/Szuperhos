package hosok;
/*
1.feladat
Írj egy Szuperhos interfészt, ami egy legyoziE metódust tartalmaz. A metódus paramétere egy Szuperhos, és egy
logikai értékkel tér vissza. Legyen egy mekkoraAzEreje metódusa is, ami nem kér paramétert, és a Szuperhos erejét
fogja visszaadni.
*/
public interface Szuperhos {
    public boolean legyoziE(Szuperhos szuperhos);
    public double mekkoraAzEreje();
}
