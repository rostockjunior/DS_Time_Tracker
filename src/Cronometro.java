import java.util.Observable;

class Cronometro extends Observable {

    private static Cronometro instance;

    public Cronometro getInstance(){
        if(instance == null)
            instance = new Cronometro();

        return instance;
    }


    public Cronometro(boolean Inici){
        int hora = 0;
        int minutos = 0;
        int segundos = 0;
        while

    }

    boolean Inici;
    boolean Parar;
    boolean Finalizar;
    int sec;
    int min;
    int hour;

    private Cronometro(){}
    void Temps(){};
}
