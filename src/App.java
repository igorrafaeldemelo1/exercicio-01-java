
public class App {

    public static void main(String[] args) throws Exception {

        

        Contas contames = new Contas();

        contames.setAgua(78);
        contames.setValorrecebido(2333);
        contames.setLuz(89);
        contames.setNet(90);
        contames.setGasolina(400);
        contames.setDescontos(35);
        contames.setCarro(500);
        contames.setCartao(300);

        System.out.println(contames.getAgua());
        System.out.println(contames.getLuz());
        System.out.println(contames.getNet());
        System.out.println(contames.getGasolina());
        System.out.println(contames.getDescontos());
        System.out.println(contames.getCarro());
        System.out.println(contames.getCartao());
        System.out.println(contames.getValorrecebido());

        Casa casa1 = new Casa();

        casa1.setCor("azul");
        casa1.setLocal("Predio");
        casa1.setValoripva(999);

        System.out.println(casa1.getLocal());
        System.out.println(casa1.getValoripva());

        Casa casa2 = new Casa("cinza", "condominio", 1);
        System.out.println(casa2.getCor());
        System.out.println(casa2.getLocal());
        System.out.println(casa2.getQuantidadedeporta());

        Meupc pc = new Meupc();

        pc.setPlacadevideo("Gtz 1660");
        pc.setProcessador("intel i5");
        pc.setCuler("Hidro warrior");
        pc.Voltagem(550);
        System.out.println(pc.getPlacadevideo());
        System.out.println(pc.getCuler());
        System.out.println(pc.getProcessador());
        System.out.println(pc.Voltagem());
    }

    

}

class Casa {

    String cor;
    String local;
    int valoripva;
    int ipvadacasa;
    int pagarIpva;
    int quantidadedeporta;

    Casa() {

    }

    public void setValoripva() {
    }

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