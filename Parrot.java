public class Parrot extends Bird {
    public Parrot(String name, String gender, int age){
        super(name, gender, age);
    }

    public void displayinfo(){
        System.out.println("Parrot - Name:" + getName()  + ", Gender: " + getGender() + ", Age: " + getAge());
    }
}