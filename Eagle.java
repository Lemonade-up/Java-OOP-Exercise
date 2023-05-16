public class Eagle extends Bird {
    public Eagle(String name, String gender, int age){
        super(name, gender, age);
    }

    public void displayinfo(){
        System.out.println("Eagle - Name:" + getName()  + ", Gender: " + getGender() + ", Age: " + getAge());
    }
}