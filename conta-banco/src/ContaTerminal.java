import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //TODO: Mensagem User
        System.out.println("Digite número da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.println("Digite sua agencia: ");
        String agencia = scanner.next();
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();
        //TODO: Obter dados
        String resultado = "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque.";
        //Mostrar mensagem
        System.out.println(resultado);
    }
}
