package domaine;

public class WSLinux extends WorkStation {
    public WSLinux(String nom) { super(nom); }

    @Override
    public boolean connect() { return outils.Reseau.connectLinux(nom); }
}