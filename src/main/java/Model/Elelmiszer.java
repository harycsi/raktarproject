package Model;

public abstract class Elelmiszer {

    protected String nev;
    protected String gyarto;
    protected int lejaratiDatum;

    public Elelmiszer(String nev, String gyarto, int lejaratiDatum) {
        this.nev = nev;
        this.gyarto = gyarto;
        this.lejaratiDatum = lejaratiDatum;
    }

    @Override
    public String toString() {
        return "neve: " + nev + ", gyártója: " + gyarto + " lejárati dátuma: " + lejaratiDatum;
    }

}