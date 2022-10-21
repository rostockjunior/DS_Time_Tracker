import java.util.Observable;

class Cronometro extends Observable {

    private static Cronometro instance;

    public Cronometro getInstance(){
        if(instance == null)
            instance = new Cronometro();

        return instance;
    }




    boolean Inici;
    boolean Finalizar;
    int sec;
    int min;
    int hour;

    private Cronometro(){}
    void Temps(){};
}
