public abstract class Dron {
    private Integer autonomia;
    private String nivelProcesamiento;
    private Mision mision;
    public Dron(Integer autonomia, String nivelProcesamiento, Mision mision){
        this.autonomia = autonomia;
        this.nivelProcesamiento = nivelProcesamiento;
        this.mision = mision;
    }
    public Integer getAutonomia() {
        return autonomia;
    }
    public String getNivelProcesamiento() {
        return nivelProcesamiento;
    }
    public Mision getMision(){
        return mision;
    }
    public void setMision(Mision mision) {
        this.mision = mision;
    }

    public Double eficienciaOperativa(){
        return (getAutonomia() * 10 + mision.extra());
    }

    public Boolean esAvanzado(){
        return esAvanzadoSegunTipo() || mision.esAvanzadoSegunMision(Dron);
    }
    public Boolean esAvanzadoSegunTipo(){}
}
