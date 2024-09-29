class EggAndChicken extends Thread{
    String name;

    public EggAndChicken(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name);

    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        EggAndChicken egg = new EggAndChicken("Яйцо");
        EggAndChicken chicken = new EggAndChicken("Курица");

        egg.start();
        chicken.start();

        while (egg.isAlive() || chicken.isAlive()){
            if(!chicken.isAlive()){
                System.out.println("Курица появилась раньше");
                break;
            } else if(!egg.isAlive()){
                System.out.println("Яйцо появилось раньше");
                break;
            }
        }
    }
}