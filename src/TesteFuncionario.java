import java.util.Scanner;

public class TesteFuncionario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Funcionario eu = new Funcionario();

        System.out.println("Qual o seu nome: ");
        eu.nome = leitor.nextLine();
        System.out.println("Qual o seu salário: ");
        eu.salario = leitor.nextDouble();
        System.out.println("Digite o aumento: ");
        double aumento = leitor.nextDouble();

        eu.aumentarSalario(aumento);
        System.out.println("Nome: " + eu.nome);
        System.out.println("Salário atual: " + eu.salario);
        System.out.println("Bônus: " + eu.calcularBonus());
        System.out.println("Status: " + eu.verificarSituacao());
    }
}
