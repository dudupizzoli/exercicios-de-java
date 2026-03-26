public class Eletrodomestico {

    String nome;
    double potenciaWatts;
    double horasPorDia;

    public double calcularConsumoDiario(){
        double consumoDiario;
        consumoDiario =  (potenciaWatts * horasPorDia) / 1000;
        return consumoDiario;
    }
    public double calcularCustoMensal(double valorKwh){
        double consumoDiario = calcularConsumoDiario();
        return consumoDiario * 30 * valorKwh;
    }
    public void exibirDados(){
        double consumoDiario = calcularConsumoDiario();
        System.out.println("Aparelho: " + nome + " " +
                "Consumo diário: " + consumoDiario);
    }

}
