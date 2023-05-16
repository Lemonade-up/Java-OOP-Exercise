public abstract class Mammal extends Animal {
    public Mammal(String name, String gender, int age){
        super(name, gender, age);
    }

    public void displayinfo(){
        System.out.println("Mammal - Name:" + getName()  + ", Gender: " + getGender() + ", Age: " + getAge());
    }

    public void speak(){
        System.out.println("Roar!!! Roar!!!");
    }
} 