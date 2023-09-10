import java.util.Scanner;

public class PrintNumbers {
    //Napisz program, który przyjmie od użytkownika liczbę naturalną większą lub równą zeru,
    // a następnie wydrukuj każdą liczbę (zaczynając od zera) aż do liczby podanej przez użytkownika;
    Scanner input = new Scanner(System.in);

    public void printing() {
        System.out.println("Wprowadź liczbę naturalną większą lub równą 0");
        int inputNumber = input.nextInt();

        for (int i = 0; i <= inputNumber; i++) {
            System.out.println(i);
        }
    }

    //Napisz podobny do poprzedniego program, który zsumuje wszystkie liczby, aż do podanej przez użytkownika, włącznie z tą liczbą i zwróci jej wartość.
    public void sumNumbers() {
        System.out.println("Wprowadź liczbę naturalną większą lub równą 0");
        int inputNumber = input.nextInt();
        int result = 0;
        if (inputNumber == 0) System.out.println("Wprowadzona wartość to 0");
        else {
            for (int i = 1; i <= inputNumber; i++) {
                result += i;
            }
            System.out.println("Suma liczb narastająco wynosi: " + result);
        }
    }

    //Ciąg fibonacciego;
    //Napisz funkcję, która przyjmie jako argument liczbę liczbę
    // naturalną większą od zera i wydrukuj wszystkie liczby ciągu fibonacciego, aż do sekwencji podanej liczby. Ciąg Fibonacciego:
    //Przykładowo dla wartości 3, wydrukowane liczby to: 0, 1, 1, 2
    // f(n)=f(n-2)+f(n-1)

    public void fibonaciSequence(int number) {

        long[] fibonacciNumbers = new long[number];
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;

        for (int i = 2; i < number; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }

        System.out.println("Liczby z ciągu Fibonacciego:");
        for (int i = 0; i < number; i++) {
            System.out.print(fibonacciNumbers[i] + " ");
        }
    }
    public void silnia(int number){
        long result = 1;
        if(number == 0) System.out.println("Podana liczba to 0");
        else {
            for (int i = 1; i <= number; i++)  result *= i;
            System.out.println("Silna z liczby " + number + " wynosi " + result);
        }
    }
}
