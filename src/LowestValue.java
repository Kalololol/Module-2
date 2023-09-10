import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LowestValue {
    public void fiveNumbers(){
        List<Integer> numbers = new LinkedList<>();
        int result ;
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadź pięć liczb całkowitych");
        for(int i = 0; i < 5; i++){
            System.out.println("Wprowadź liczbę" );
            numbers.add(input.nextInt());
        }
        result = numbers.get(0);
        for (int number : numbers){
            if(result > number) result = number;
        }

        System.out.println("Najmniejsza z liczb to: " + result );


    }
}
