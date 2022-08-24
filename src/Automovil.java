public class Automovil extends Vehiculo implements InterfaceVehiculoTerrestre {


    public Automovil() {
    }

    @Override
    public void transportePublico() {
        System.out.println("Transporta hasta 100 pasajeros");

    }

    @Override
    public void transporteParticular() {
        System.out.println("Transporta hasta 5 pasajeros");

    }

    @Override
    protected void transportCarga() {
        System.out.println("Transporta hasta 100 toneladas");

    }

    @Override
    protected void transportePasajeros() {
        System.out.println("Transporta pasajeros");

    }

    @Override
    protected void transporteAlimentos() {
        System.out.println("Transporta de alimentos");

    }
}
