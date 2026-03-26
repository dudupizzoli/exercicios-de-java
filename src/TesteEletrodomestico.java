import java.util.Scanner;

public class TesteEletrodomestico {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Eletrodomestico meuEletro = new Eletrodomestico();

        double vKwh;
        double respvKwh;
        System.out.println("Digite qual é o seu eletrodoméstico");
        meuEletro.nome = leitor.nextLine();
        System.out.println("Digite a potência dele: ");
        meuEletro.potenciaWatts = leitor.nextDouble();
        System.out.println("Digite as horas por dia: ");
        meuEletro.horasPorDia = leitor.nextDouble();
        System.out.println("Digite o valor Kw/h em sua regiâo: ");
        vKwh = leitor.nextDouble();

        meuEletro.calcularConsumoDiario();
        System.out.println(meuEletro.calcularCustoMensal(vKwh));
        meuEletro.exibirDados();
        System.out.println("Consumo mensal: " + meuEletro.calcularCustoMensal(vKwh));
    }
}
