package Mokiniai;

public class Main {
    public static void main(String[] args) {
        Mokinys[] mokinys = {
                new Mokinys(3, "Matas", "Astaruskas"),
                new Mokinys(4, "Motiejus", "Alijosius"),
                new Mokinys(1, "Kotryna", "Puodziunaite"),
                new Mokinys(2, "Vilte", "Kumpyte"),
                new Mokinys(5, "Domas", "Strigunas"),
                new Mokinys(3, "Aiste", "Guodyte"),
                new Mokinys(5, "Vilius", "Strigunas")
        };
        Mokinys tuscias;
        for (int i = 0; i < mokinys.length; i++) {
            for (int j = i + 1; j < mokinys.length; j++) {
                if (compare(mokinys[i], mokinys[j])) {
                    tuscias = mokinys[i];
                    mokinys[i] = mokinys[j];
                    mokinys[j] = tuscias;
                }
            }
            System.out.println(mokinys[i]);
        }
    }
    static boolean compare(Mokinys a, Mokinys b) {
//        boolean r = a > b;
//        lyginam klases
        if (a.klase > b.klase) return true;
        else if (a.klase < b.klase) return false;
//        lyginam pavardes
        int r = a.pavarde.compareTo(b.pavarde);
        if (r != 0) return r > 0;
//        lyginam vardus
        r = a.vardas.compareTo(b.vardas);
        return r > 0;
    }
}
