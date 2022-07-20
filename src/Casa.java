
public class Casa {

    String cor;
    String local;
    int valoripva;
    int ipvadacasa;
    int pagarIpva;
    int quantidadedeporta;

    Casa(String cor, String local, int quantidadedeporta) {
        this.cor = cor;
        this.local = local;
        this.quantidadedeporta = quantidadedeporta;
    }

    void setCor(String cor) {
        this.cor = cor;

    }

    String getCor() {
        return cor;
    }

    void setLocal(String local) {
        this.local = local;
    }

    String getLocal() {
        return local;
    }

    void setPagarIpva(int pagarIpva) {
        this.pagarIpva = pagarIpva;
    }

    int getPagarIpva() {
        return pagarIpva;
    }

    void setQuantidadedeporta(int quantidadedeporta) {
        this.quantidadedeporta = quantidadedeporta;
    }

    int getQuantidadedeporta() {
        return quantidadedeporta;
    }

    void setValoripva(int valoripva) {
        this.valoripva = valoripva;
    }

    int getValoripva() {
        return valoripva;
    }

}
