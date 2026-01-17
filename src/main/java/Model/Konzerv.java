package Model;

public class Konzerv extends Elelmiszer{

        private String leiras;
        private String recept;

    public Konzerv(String nev, String gyarto, int lejaratiDatum, String leiras, String recept) {
        super(nev, gyarto, lejaratiDatum);
        this.leiras = leiras;
        this.recept = recept;
    }

    public String getLeiras() {
        return leiras;
    }

    public void setLeiras(String leiras) {
        this.leiras = leiras;
    }

    public String getRecept() {
        return recept;
    }

    public void setRecept(String recept) {
        this.recept = recept;
    }

    @Override
    public String toString() {
        return super.toString() + ", leírás: " + leiras + ", recept: " + recept;
    }

}
