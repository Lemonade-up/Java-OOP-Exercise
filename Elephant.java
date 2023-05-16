public class Elephant extends Mammal {
    public Elephant(String name, String gender, int age){
        super(name, gender, age);
    }
    
    public void displayinfo(){
        System.out.println("Elephant - Name:" + getName()  + ", Gender: " + getGender() + ", Age: " + getAge());
    }
}