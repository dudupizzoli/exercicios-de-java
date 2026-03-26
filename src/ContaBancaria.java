public class ContaBancaria {
    String titular;
    double saldo;

    public void depositar(double valor){
        saldo += valor;
    }
    public void sacar(double valor){
    if (saldo >= valor ){
        saldo -= valor;
    }else{
        System.out.println("Saldo insuficiente");
    }
    }
    public String verificarStatus(){
        if (saldo>0){
            return "Conta positiva";
        } else if (saldo == 0){
            return "Conta Zerada";
        } else{
            return "Conta em débito";
        }
    }
}
