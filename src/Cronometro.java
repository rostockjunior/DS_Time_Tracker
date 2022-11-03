import java.util.Observable;

class Cronometro extends Observable {

    private static Cronometro instance;

    public Cronometro getInstance(){
        if(instance == null)
            instance = new Cronometro();

        return instance;
    }


    public Cronometro(){
        int hora = 0;
        int minutos = 0;
        int segundos = 0;
        string min="", seg="", hora="";
        try{
            while(Pausar){
                //mientras CronActivo sea verdadero seguira aumentando el tiempo
                while(CronActivo){
                    thread.sleep(1000) //se incrementa 1 segundo
                    segundos += 1;
                    if(segundos == 60){
                        segundos = 0;
                        minutos++;
                    }
                    if (minutos == 60){
                        minutos == 0;
                        hora++;
                    }
                }
            }
        }

    }

    boolean Inici;
    boolean CronActivo
    boolean Pausar;
    boolean Finalizar;
    int sec;
    int min;
    int hour;

    private Cronometro(){}
    void Temps(){};
}
