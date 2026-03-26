import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ContaBancaria minhaConta = new ContaBancaria();

        double valor;
        System.out.println("Digite o nome do titular: ");
        minhaConta.titular = leitor.nextLine();
        System.out.println("Digite o saldo: ");
        minhaConta.saldo = leitor.nextDouble();

        minhaConta.depositar(100);
        minhaConta.depositar(200);

        minhaConta.sacar(50);
        minhaConta.sacar(200);
        minhaConta.sacar(800);

        System.out.println("Saldo final: " + minhaConta.saldo);
        System.out.println("Status: " + minhaConta.verificarStatus());

    }
}
