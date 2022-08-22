public abstract class Vehiculo {
    protected int id;
    protected String tipo;
    protected String marca;

    protected abstract void transportarEnTierra();
    protected abstract void transporteEnAgua();
    protected abstract void transporteEnAire();

}
