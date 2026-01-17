package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Raktar {

    private List<Elelmiszer> elelmiszerek;

    public Raktar() {
        this.elelmiszerek = new ArrayList<>();
    }

    public Elelmiszer addElelmiszer(Elelmiszer elelmiszer){
        this.elelmiszerek.add(elelmiszer);
        return elelmiszer;
    }

    public List<Elelmiszer> getElelmiszerLista() {
        return Collections.unmodifiableList(this.elelmiszerek);
    }
}
