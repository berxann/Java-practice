package GoshaOop;     //абстракция инкапсуляция полимарфизм наследование - основные концпеции ооп

public class Main {
    public static void main(String[] args) {
        int weight = 10;
        Personality avito = new Personality(181);
        Personality avito2 = new Personality("S" + 181);
        avito2.phrase1 = "а я на массе: ";
        avito2.weight = 42;
        System.out.println(avito.phrase1 + avito.phrase2 + avito2.height);
        System.out.println(avito2.phrase1 + avito2.weight);
        avito.say("Mayday");


    }
}

class Personality {
    public int height = 180;
    int weight = 10;
    String Ramizrez;
    public String phrase1 = "Я встречусь с тобой! ";
    public String phrase2 = "Но сначала я скажу свой рост: ";

    public void say(String name) {

        System.out.println("hello " + name);
    }



    public Personality(String name) {

        Ramizrez = name;
    }
}



