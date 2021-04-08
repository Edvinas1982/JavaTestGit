package Mokiniai;

class Mokinys {
    int klase;
    String vardas;
    String pavarde;

    Mokinys(int klase, String vardas, String pavarde) {
        this.klase = klase;
        this.vardas = vardas;
        this.pavarde = pavarde;
    }
    public String toString() {
        return klase + " klase " + vardas + " " + pavarde;
    }
}
