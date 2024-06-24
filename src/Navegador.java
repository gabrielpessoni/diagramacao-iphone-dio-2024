// Navegador.java
public abstract class Navegador {
    public abstract boolean wiFi();
    public abstract void pagina();
    public abstract void novaAba();
    public abstract void recarregar();
}

// Safari.java
public class Safari extends Navegador {
    @Override
    public boolean wiFi() {
        System.out.println("Safari verificando Wi-Fi.");
        return true;
    }

    @Override
    public void pagina() {
        System.out.println("Safari carregando página.");
    }

    @Override
    public void novaAba() {
        System.out.println("Safari abrindo nova aba.");
    }

    @Override
    public void recarregar() {
        System.out.println("Safari recarregando página.");
    }
}

// Chrome.java
public class Chrome extends Navegador {
    @Override
    public boolean wiFi() {
        System.out.println("Chrome verificando Wi-Fi.");
        return true;
    }

    @Override
    public void pagina() {
        System.out.println("Chrome carregando página.");
    }

    @Override
    public void novaAba() {
        System.out.println("Chrome abrindo nova aba.");
    }

    @Override
    public void recarregar() {
        System.out.println("Chrome recarregando página.");
    }
}
