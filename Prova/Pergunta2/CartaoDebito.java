package Pergunta2;

public class CartaoDebito extends Pagamento {
    private String numCartao;
    private String titularCartao;

    public CartaoDebito(String dataHoraPagamento, int numeroPagamento, double valorPago, String numCartao,String titularCartao) {
        
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.numCartao = numCartao;
        this.titularCartao = titularCartao;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getTitularCartao() {
        return titularCartao;
    }

    public void setTitularCartao(String titularCartao) {
        this.titularCartao = titularCartao;
    }

    public String imprimirCupomFiscal() {
        return "Data: " + getDataHoraPagamento() + "\n Numero do Pagamento: " + getNumeroPagamento() + "\n Valor: " + getValorPago()+ "\n Numero do Cartao"+getNumCartao()+ "\nTitular do cartao"+ getTitularCartao();

    }

}
