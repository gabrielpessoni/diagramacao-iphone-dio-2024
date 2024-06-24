// IPhone.java
public class IPhone extends ReprodutorMusical implements Telefone, Navegador {

    // Métodos de ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("iPhone tocando música.");
    }

    @Override
    public void pausar() {
        System.out.println("iPhone pausando música.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("iPhone selecionando música.");
    }

    // Métodos de Telefone
    @Override
    public void ligar() {
        System.out.println("iPhone ligando.");
    }

    @Override
    public void atender() {
        System.out.println("iPhone atendendo.");
    }

    @Override
    public void ligacao() {
        System.out.println("iPhone em ligação.");
    }

    // Métodos de Navegador
    @Override
    public boolean wiFi() {
        System.out.println("iPhone verificando Wi-Fi.");
        return true;
    }

    @Override
    public void pagina() {
        System.out.println("iPhone carregando página.");
    }

    @Override
    public void novaAba() {
        System.out.println("iPhone abrindo nova aba.");
    }

    @Override
    public void recarregar() {
        System.out.println("iPhone recarregando página.");
    }
}
