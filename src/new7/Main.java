package new7;
public class Main {
    public static void main(String[] args) {
        for(int i = 0; i<15; i++){
            if(i%2==0){
                continue;               //что это?
            }
            System.out.println("это нечетное число "+ i);

        }
    }
}

