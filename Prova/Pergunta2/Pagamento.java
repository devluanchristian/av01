package Pergunta2;

public abstract class Pagamento {
    protected String dataHoraPagamento;
    private int numeroPagamento;
    private double valorPago;

    public Pagamento(String dataHoraPagamento, int numeroPagamento, double valorPago) {
        this.dataHoraPagamento = dataHoraPagamento;
        this.numeroPagamento = numeroPagamento;
        this.valorPago = valorPago;
    }

    public String getDataHoraPagamento() {
        return dataHoraPagamento;
    }

    public void setDataHoraPagamento(String dataHoraPagamento) {
        this.dataHoraPagamento = dataHoraPagamento;
    }

    public int getNumeroPagamento() {
        return numeroPagamento;
    }

    public void setNumeroPagamento(int numeroPagamento) {
        this.numeroPagamento = numeroPagamento;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public String imprimirCupomFiscal() {

        return "Data: " + getDataHoraPagamento() + "\n Numero do Pagamento: " + getNumeroPagamento() + "\n Valor: "
                + getValorPago();

    }

}
