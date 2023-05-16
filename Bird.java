public abstract class Bird extends Animal {
    public Bird(String name, String gender, int age){
        super(name, gender, age);
    }

    public void displayinfo(){
        System.out.println("Bird - Name:" + getName()  + ", Gender: " + getGender() + ", Age: " + getAge());
    }

    public void speak(){
        System.out.println("Chirp! Chirp! Chirp!");
    }

}