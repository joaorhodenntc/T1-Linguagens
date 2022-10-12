public class ConverteSentenca {
    Terminais terminal = new Terminais();
    NaoTerminais naoTerminal = new NaoTerminais();

    public boolean converteSentenca(String sentenca) {
        if (sentenca == "") {
            return false;
        } else {
            for (int i = 0; i < sentenca.length(); i++) {
                char[] sentencaArray = sentenca.toCharArray();

                if (Character.isLowerCase(sentencaArray[i])) {
                    naoTerminal.adicionaNaoTerminal(sentencaArray[i]);
                } else if (Character.isUpperCase(sentencaArray[i])) {
                    terminal.adicionaTerminal(sentencaArray[i]);
                }
            }
            return true;
        }
    }

    public Character imprimeInicial() {
        return terminal.getTerminais(0);
    }

    public String imprimeTerminal() {
        return terminal.toString();
    }

    public String imprimeNaoTerminal() {
        return naoTerminal.toString();
    }

}
