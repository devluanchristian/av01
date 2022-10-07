package Pergunta3;

public class Mensalidade {
    private double valorMensalidade;
    private int numeroIrmaos;
    private double desconto;

    public Mensalidade(double valorMensalidade, int numeroIrmaos) {
        this.valorMensalidade = valorMensalidade;
        this.numeroIrmaos = numeroIrmaos;
        this.desconto = desconto;
    }

    public double desconto {
        
    }

    public double calculaMensalidade(){
        return this.valorMensalidade + this.desconto;
    }
}
