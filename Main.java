import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ConverteSentenca converte = new ConverteSentenca();

        System.out.println("Digite a sentença: ");
        String inputSentenca = null;
        while (inputSentenca != "") {
            inputSentenca = sc.nextLine();
            converte.converteSentenca(inputSentenca);
        }
        System.out.print("G = {" + converte.imprimeTerminal() + "},");
        System.out.println(" {" + converte.imprimeNaoTerminal() + "},P," +
                converte.imprimeInicial());

        sc.close();

    }
}