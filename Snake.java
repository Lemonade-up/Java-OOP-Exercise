public class Snake extends Reptile {
    public Snake(String name, String gender, int age){
        super(name, gender, age);
    }

    public void displayinfo(){
        System.out.println("Snake - Name:" + getName()  + ", Gender: " + getGender() + ", Age: " + getAge());
    }
}