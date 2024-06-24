// Contato.java
public class Contato {
    private String nome;
    private String numero;

    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }
}

// Telefone.java
public abstract class Telefone {
    protected Contato[] contatos;

    public abstract void ligar();
    public abstract void atender();
    public abstract void ligacao();
}

// Nokia3310.java
public class Nokia3310 extends Telefone {
    @Override
    public void ligar() {
        System.out.println("Nokia 3310 ligando.");
    }

    @Override
    public void atender() {
        System.out.println("Nokia 3310 atendendo.");
    }

    @Override
    public void ligacao() {
        System.out.println("Nokia 3310 em ligação.");
    }
}

// MotorolaRazrV3.java
public class MotorolaRazrV3 extends Telefone {
    @Override
    public void ligar() {
        System.out.println("Motorola Razr V3 ligando.");
    }

    @Override
    public void atender() {
        System.out.println("Motorola Razr V3 atendendo.");
    }

    @Override
    public void ligacao() {
        System.out.println("Motorola Razr V3 em ligação.");
    }
}
