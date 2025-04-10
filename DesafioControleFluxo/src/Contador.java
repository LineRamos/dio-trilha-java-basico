import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro : ");
        int parametroUm = terminal.nextInt();
        System.out.print("Digite o segundo parâmetro  : ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("\nO segundo parâmetro deve ser maior que o primeiro.");
        }
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção

        int contagem = parametroDois - parametroUm;

        if (contagem < 1) {
            throw new ParametrosInvalidosException();
        }

        for (int contador = 1; contador <= contagem ; contador++) {
            System.out.println("Imprimindo o número " + contador);
        }
    }
}