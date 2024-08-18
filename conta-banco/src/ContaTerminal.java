import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu número de conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite seu primeiro nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenomeCliente = scanner.next();

        System.out.println("Digite seu saldo: ");
        BigDecimal saldo = BigDecimal.valueOf(scanner.nextDouble());
        
        //TODO: devemos aplicar validações e restrições aos valores dos inputs.
        //agencia que não aceita letras e outros caracteres especiais
        //nome com trim
        //saldo que não pode começar negativo, etc...

        System.out.println(
            String.format("Olá %s %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque",
                nomeCliente, sobrenomeCliente, agencia, conta, saldo.doubleValue())
        );

    }
}
