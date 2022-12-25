package new6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do{
            System.out.println("введите пж 5!");         ///два варианта//
            value = scanner.nextInt();


        } while(value !=5);


        System.out.println("вы ввели 5! Молодцы!");
    }




   class second  {
        void again(){
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.println("Введи 9!");
        while(value!=5) {
            System.out.println("введи 9!");
            value = scanner.nextInt();
        } System.out.println("вы ввели 9! Молодцы!");
    }
}}