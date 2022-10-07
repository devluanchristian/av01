package Pergunta2;

public class main {
    public static void main(String[] args) {

        CartaoDebito cd = new CartaoDebito("12/12/12", 5, 2000, " 5252525444886", " Luan Christian");

        System.out.println(cd.imprimirCupomFiscal());

        CartaoCredito cc = new CartaoCredito("21/02/12", 2, 5000, "548864835438", "Visa", "Christian ");

        System.out.println(cc.imprimirCupomFiscal());

        Pix pix = new Pix("12/12/21", 5, 40, true);

        System.out.println(pix.imprimirCupomFiscal());

    }
}
