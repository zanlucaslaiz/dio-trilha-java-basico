import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner conta = new Scanner(System.in);
        int numConta;
        String agencia;
        String nomeCliente;
        double saldo;


        System.out.println("CONTA BANCARIA");
        System.out.println("Por favor, digite o número da conta. (1234)");
        numConta = conta.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        agencia = conta.next();

        System.out.println("Informe seu nome: ");
        nomeCliente = conta.next();

        System.out.println("Informe seu saldo: ");
        saldo = conta.nextDouble();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + numConta + " e seu saldo " + saldo + " já está disponnível para saque.");


        conta.close();
       
    }
}

