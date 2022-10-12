import java.util.ArrayList;

public class NaoTerminais {
    private ArrayList<Character> naoTerminais = new ArrayList<>();

    public boolean adicionaNaoTerminal(char nt) {
        if (naoTerminais == null) {
            naoTerminais.add(nt);
        } else {
            if (naoTerminais.contains(nt)) {
                return false;
            } else {
                naoTerminais.add(nt);
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return naoTerminais.toString().replace("[", "").replace("]", "");
    }

    public Character getNaoTerminais(int i) {
        return naoTerminais.get(i);
    }
}
