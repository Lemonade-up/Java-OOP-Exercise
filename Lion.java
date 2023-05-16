public class Lion extends Mammal {
    public Lion(String name, String gender, int age){
        super(name, gender, age);
    }
    
    public void displayinfo(){
        System.out.println("Lion - Name:" + getName()  + ", Gender: " + getGender() + ", Age: " + getAge());
    }
}