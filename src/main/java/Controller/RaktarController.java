package Controller;

import Model.*;
import View.RaktarView;

import java.util.List;

public class RaktarController {

    private Raktar raktar;
    private RaktarView view;

    public RaktarController(Raktar raktar, RaktarView view) {
        this.raktar = raktar;
        this.view = view;
    }

    public void listaElelmiszer(){
        List<Elelmiszer> elelmiszerek = raktar.getElelmiszerLista();
        view.lista(elelmiszerek);
    }

    public void ujElelmiszer() {
        String nev = view.readLine("Add meg a nevét: ");
        String gyarto = view.readLine("Add meg a gyártót: ");
        int lejaratiDatum = view.readIntWithPrompt("Add meg a lejárati dátumát (2026.01.01.): ");
        String leiras = view.readLine("Add meg az állat egészségifokát (0-100): ");
        String recept = view.readLine("Add meg a gyártót: ");

        Elelmiszer k = new Konzerv(nev,gyarto,lejaratiDatum,leiras,recept);
        raktar.addElelmiszer(k);

        view.showMessage("Új termék sikeresen felvéve!");
    }



}
