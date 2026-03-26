public class Funcionario {
    String nome;
    double salario;

    public void aumentarSalario(double valor){
        salario += valor;
    }
    public double calcularBonus(){
        return salario * 0.1;
    }
    public String verificarSituacao(){
        if (salario >= 5000){
           return "Salário alto";
        }else if (2000 <= salario){
            return "Salário médio";
        }else{
            return "Salário baixo";
        }
    }

}
