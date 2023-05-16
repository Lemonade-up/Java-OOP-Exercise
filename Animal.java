public abstract class Animal {
    private String name;
    private String gender;
    private int age;

    public Animal(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void sleep() {
        System.out.println("Zzz");
    }

    public abstract void speak();

    public void displayinfo(){
        System.out.println("Animal - Name:" + getName()  + ", Gender: " + getGender() + ", Age: " + getAge());
    }


    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
}