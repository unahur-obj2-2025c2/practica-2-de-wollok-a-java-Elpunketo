public class Vigilancia extends Mision {
    List<Sensores> sensores = {};
    @Override
    protected Integer extra(){
        if(sensores.all(c -> c.mejorasTecnologicas == True)){
            extra = sensores.find(c -> c.mejorasTecnologicas == True).
            /* estaria bueno que expliquen esto */
        }
    }
}
