public class dronVigilancia extends Dron {
    public dronVigilancia(Integer autonomia, String nivelProcesamiento, Mision mision) {
        super(autonomia, nivelProcesamiento, mision);
    }

    @Override
    protected Double doCosto() {
        return 0.0;
    }
}
