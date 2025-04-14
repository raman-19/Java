package raman.Oops.Interfaces;

public class NiceCar {

    private Engin engine;
    private Media player = new CdPlayer();


    public NiceCar(){
        engine = new PowerEngin();
    }
    public NiceCar(Engin engine){
        this.engine=engine;
    }
    public void start (){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void acc(){
        engine.acc();
    }
    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }
    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }
}

