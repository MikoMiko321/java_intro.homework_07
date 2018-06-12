package geekbrains.java_intro.homework_07;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate plate) {
        if (this.appetite <= plate.getFood()){
            plate.setFood(plate.getFood()-this.appetite);
            System.out.println("Cat "+this.name+" has eaten "+this.appetite+" units of food and is now full.");
            this.satiety = true;
        } else {
            System.out.println("Cat "+this.name+" won't eat because there is not enough food in the plate.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
}