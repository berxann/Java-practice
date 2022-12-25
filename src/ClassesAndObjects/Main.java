package ClassesAndObjects;
public class Main{
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.SetName("Рюк");
        person1.setAge(19);
        person1.speak();




    }
}
class Person{
    private String name;
    private int age;
    public void SetName(String username){
        name = username;
        }
        public String getName(){
        return name;
    }
    public void setAge(int userAge){
        age = userAge;
    }
    public int getAge(){
     return age;
    }
    void speak(){
        System.out.println("Меня зовут " +name+", мне "+age+" лет");
    }
}

