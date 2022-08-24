public class Avion extends Vehiculo implements InterfaceAvion {

    public Avion() {
    }

    @Override
    protected void transportCarga() {
        System.out.println("Transporta hasta 5000 toneladas por aire");

    }

    @Override
    protected void transportePasajeros() {
        System.out.println("Transporta hasta 500 pasajeros por aire");

    }

    @Override
    protected void transporteAlimentos() {
        System.out.println("Transporta hasta 325 toneladas por aire");

    }

    @Override
    public void transporteCarga() {
        System.out.println("Transporta hasta 800 toneladas por aire");

    }

    @Override
    public void transporteDePasajeros() {

    }
}
