import java.util.Random;

public class Person2{
     public static void main(String[] args){
        Random random = new Random();
        int[] numbers = {1, 5, 10, 20};
        int x = numbers[random.nextInt(numbers.length)];

        for (int i=0; i<10; i++){
            x = numbers[random.nextInt(numbers.length)];
            if (x == 5) {
                System.out.println("hi");
            } else {
                System.out.println("ok");
            }
        }
    }    
}



