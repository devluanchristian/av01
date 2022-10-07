package Pergunta2;

public class Pix extends Pagamento {
    private boolean comprovanteTransacaoPix;

    public Pix(String dataHoraPagamento, int numeroPagamento, double valorPago, boolean comprovanteTransacaoPix) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    public boolean getComprovanteTransacaoPix() {
        return comprovanteTransacaoPix;
    }

    public void setComprovanteTransacaoPix(boolean comprovanteTransacaoPix) {
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }
    public String imprimirCupomFiscal(){
        return "Data: "+getDataHoraPagamento() + "\nNumero do Pagamento: "+getNumeroPagamento()+ "\nValor pago no Pix: "+getValorPago() + "\nEnvio: "+getComprovanteTransacaoPix();

    }

}
