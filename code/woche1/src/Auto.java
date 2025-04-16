public class Auto {

    //Eigenschaften der Klasse bzw. globale Variablen
    private String marke;
    private int ps;

    //Konstruktor mit Parametern
    public Auto(String marke, int ps) {
        setMarke(marke);
        setPs(ps);
    }

    //Standardkonstruktor
    public Auto() {
        marke = "Audi";
        ps = 150;
    }

    public void printAuto() {
        System.out.println("--------- Auto ----------");
        System.out.println("Marke: " + marke);
        System.out.println("PS: " + ps);
        System.out.println();
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public String getMarke() {
        return marke;
    }

    public int getPs() {
        return ps;
    }
}
