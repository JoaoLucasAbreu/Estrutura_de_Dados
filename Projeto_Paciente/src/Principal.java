import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);

        Paciente P = new Paciente();

        // Entrada de Dados
        System.out.println("Nome: ");
        P.nome = scan.nextLine();

        System.out.println("Idade: ");
        P.idade = scan.nextInt();

        // Saída de Dados
        System.out.println("Frequência máxima = " + P.max_cardiaco());
        double[] alvo = P.alvo_cardiaco();

        System.out.println("Frequência alvo entre " + Math.round(alvo[0]) + " e " + Math.round(alvo[1]));

    }

}
