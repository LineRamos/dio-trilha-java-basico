import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // Tem que importar antes o pacote java.util

        System.out.println("=======================================================================");
        System.out.println(" Olá, seja bem vindo ao nosso banco!!! ");
        System.out.println("=======================================================================");
        System.out.println(" Para iniciar a abertura da conta, preciso de algumas informações ");
        System.out.println("=======================================================================");
        System.out.print(" Digite o seu nome : ");
        String nome = scanner.next();
        System.out.println("=======================================================================");
        System.out.println(" Olá " + nome + "!");
        System.out.println(" Precisamos dos seus dados bancários.");
        System.out.println("=======================================================================");
        System.out.print(" Por favor, digite o número da agência : ");
        String agencia = scanner.next();
        System.out.print(" Por favor, digite o número da conta bancária : ");
        int numero = scanner.nextInt();
        System.out.print(" Por favor, digite o seu saldo : ");
        double saldo = scanner.nextDouble();
        System.out.println("=======================================================================");
        System.out.println(" Olá " + nome + ", obrigado por criar uma conta em nosso banco ");
        System.out.println("     SEUS DADOS BANCÁRIOS ");
        System.out.println("------------------------------");
        System.out.println("        Agência : " + agencia);
        System.out.println(" Conta bancária : " + numero);
        System.out.println("          Saldo : R$ " + saldo);
        System.out.println("=======================================================================");
        System.out.println(" O seu saldo já está disponível para saque! ");
        System.out.println("=======================================================================");
        System.out.println("         A G R A D E C E M O S  A  P R E F E R Ê N C I A");
        System.out.println("=======================================================================");
    }
}