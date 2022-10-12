import java.util.ArrayList;

public class Terminais {
    private ArrayList<Character> terminais = new ArrayList<>();

    public boolean adicionaTerminal(char t) {
        if (terminais == null) {
            terminais.add(t);
        } else {
            if (terminais.contains(t)) {
                return false;
            } else {
                terminais.add(t);
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return terminais.toString().replace("[", "").replace("]", "");
    }

    public Character getTerminais(int i) {
        return terminais.get(i);
    }
}
