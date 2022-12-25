package Lesson19;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("- Представтесь пожалуйста, коллеги.");
        human human1 = new human();
        human1.setAge(18);
        human1.setName("Владимир");
        human1.hellowing();
        human1.getInfo();
        human human2 = new human();
        human2.setAge(67);
        human2.setName("Боб");
        human2.hellowing();
        human2.getInfo();





    }
    static class human{
        String name;
        int Age;

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int Age) {
           this.Age=Age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return Age;
        }
         public void hellowing(){
             System.out.print("Здраствуйте, меня зовут ");
         }


        public void getInfo() {
            System.out.println(name + ", " + "мне "+ Age + ".");
        }



    }

    }


