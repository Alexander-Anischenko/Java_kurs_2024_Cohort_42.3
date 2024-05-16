package lesson29.classWork29;

//Внешшний класс

public class Transport {

    private String model;

    private String goal;//цель
    private Engine engine;



    class Engine {

        private boolean isEnable = false;

        private double volume;

        private Engine(double volume) {
            this.volume = volume;
        }
        public void turnOn() {
            if (! this.isEnable) {
                this.isEnable = true;
                System.out.println("The Engine is turned on");
            }

        }
        public void turnOff() {
            if (this.isEnable) {
                this.isEnable = false;
                System.out.println("The Engine is turned off");
            }

        }
        public void criticalTurnOff() {
            System.out.println("Critical situation");
            this.isEnable =false;
            Transport.this.stop();
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "isEnable=" + isEnable +
                    ", volume=" + volume +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Transport{" +
                "engine=" + engine +
                ", model='" + model + '\'' +
                ", goal='" + goal + '\'' +
                '}';
    }
    public void go() {
        System.out.println("Transport is going");
        this.engine.turnOn();
    }
    public void stop() {
        System.out.println("Transport is stopping");
        this.engine.turnOff();
    }
    public void handleAnimalOnWay() {
        System.out.println("Animal is on the way");
        this.engine.criticalTurnOff();
    }

    public Transport(String model, String goal, double engineVolume) {
        this.model = model;
        this.goal = model;
        this.engine = this.new Engine(engineVolume);

    }

}
