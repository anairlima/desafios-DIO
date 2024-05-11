
/** Desafio Proposto: https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe 
 * 
 * Resumo: Simulando Uma Conta Bancária Através Do Terminal/Console
*/

import java.util.Scanner; 

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-Vindo(a) ao Banco X");

        System.out.println("Informe seu Nome");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Agora, digite o número da sua conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Informe o seu saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();
    }
}
