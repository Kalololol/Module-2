import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Average3Number {
    //Średnia z 3 liczb;
    //Napisz metodę, która zapyta użytkownika o 3 liczby, a następnie zwróć średnią z tych liczb (dokonaj sprawdzenia, czy liczby są większe od 0);
    //Wywołaj funkcję i wydrukuj jej wartość;
    //Jakie warunki powinny spełniać te liczby, aby można było z nich wyliczyć średnią?

    public void average3Numbers(){
        int numInput;
        double result;
        List<Integer> numbers = new LinkedList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadź 3 liczby do obliczenia średniej.");
        System.out.println("1sza liczba: ");
        numbers.add(input.nextInt());
        System.out.println("2ga liczba: ");
        numbers.add(input.nextInt());
        System.out.println("3cia liczba: ");
        numbers.add(input.nextInt());
        for (int number : numbers ) {
            if(number < 0 ){
                System.out.println("Liczba " + number + " jest mniejsza/równa 0");
            }
        }
        int sum =0;
        for(double average : numbers) {
            sum += average;
        }
        result = (double)sum/3;
        System.out.println(result);
        Attention();
    }

    public void Attention(){
        System.out.println("Pamiętaj, średniej nie liczymy z liczb ujemnych oraz zera");
    }
}
