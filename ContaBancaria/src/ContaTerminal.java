import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner ent =  new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("******Bem Vindo ao Banco DIO********");
        System.out.print("Informe o número da Agência: ");
        agencia = ent.nextLine();
        System.out.print("Informe o número da sua Conta: ");
        numeroConta = ent.nextInt();
        System.out.print("Informe seu Nome Completo: ");
        nomeCliente = ent.next();
        ent.nextLine();
        System.out.print(nomeCliente + " Informe seu saldo inicial: ");
        saldo = ent.nextDouble();
        System.out.println();
        System.out.println("*************************************");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua Agência é " + agencia + 
        ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponivel para saque.");
        System.out.println("*****Volte Sempre*****");

        ent.close();
    }    
}
