package new8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("чуз ю левел");
        String level = scan.nextLine();
        switch(level){
            case "новичок":
                System.out.println("1");
                break;
            case "продвинутый":
                System.out.println("молодой");
            case "проффесианал":
                System.out.println("тебе 15 дней осталось жить");
                break;
            case "я не знаю" :
                System.out.println("ты покушал какашек");
                break;
            default:
                System.out.println("Выбери уже как там тебя зовут");


        }


    }
}
