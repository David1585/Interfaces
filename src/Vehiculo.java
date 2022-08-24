public abstract class Vehiculo {
    protected int id;
    protected String tipo;
    protected String marca;

    protected abstract void transportCarga();
    protected abstract void transportePasajeros();
    protected abstract void transporteAlimentos();

}
