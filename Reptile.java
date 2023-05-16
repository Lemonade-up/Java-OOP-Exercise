public abstract class Reptile extends Animal {
    public Reptile(String name, String gender, int age){
        super(name, gender, age);
    }

    public void displayinfo(){
        System.out.println("Reptile - Name:" + getName()  + ", Gender: " + getGender() + ", Age: " + getAge());
    }

    public void speak(){
        System.out.println("Ssssssss!");
    }

}