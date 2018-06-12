package geekbrains.java_intro.homework_07;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if (food<0) {
            System.out.println("Amount of food can't be negative!");
            return;
        }
        this.food = food;
    }

    public void addFood(int food){
        this.food = this.food + food;
    }
}