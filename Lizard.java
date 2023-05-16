public class Lizard extends Reptile {
    public Lizard(String name, String gender, int age){
        super(name, gender, age);
    }

    public void displayinfo(){
        System.out.println("Lizard - Name:" + getName()  + ", Gender: " + getGender() + ", Age: " + getAge());
    }
}