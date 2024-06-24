// Musica.java
public class Musica {
    private String nome;
    private String caminho;

    public Musica(String nome, String caminho) {
        this.nome = nome;
        this.caminho = caminho;
    }

    public String getNome() {
        return nome;
    }

    public String getCaminho() {
        return caminho;
    }
}

// ReprodutorMusical.java
public abstract class ReprodutorMusical {
    protected Musica[] musicas;

    public abstract void tocar();
    public abstract void pausar();
    public abstract void selecionarMusica();
}

// Walkman.java
public class Walkman extends ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Walkman tocando música.");
    }

    @Override
    public void pausar() {
        System.out.println("Walkman pausando música.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Walkman selecionando música.");
    }
}

// Discman.java
public class Discman extends ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Discman tocando música.");
    }

    @Override
    public void pausar() {
        System.out.println("Discman pausando música.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Discman selecionando música.");
    }
}
