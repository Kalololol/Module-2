import java.util.Scanner;

public class PrintNumbers {
    //Napisz program, który przyjmie od użytkownika liczbę naturalną większą lub równą zeru,
    // a następnie wydrukuj każdą liczbę (zaczynając od zera) aż do liczby podanej przez użytkownika;
    private final Scanner input = new Scanner(System.in);

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
            for (int i = 1; i <= inputNumber; i++) {
                result += i;
            }
            System.out.println("Suma liczb narastająco wynosi: " + result);
    }

    //Ciąg fibonacciego;
    //Napisz funkcję, która przyjmie jako argument liczbę liczbę
    // naturalną większą od zera i wydrukuj wszystkie liczby ciągu fibonacciego, aż do sekwencji podanej liczby. Ciąg Fibonacciego:
    //Przykładowo dla wartości 3, wydrukowane liczby to: 0, 1, 1, 2
    // f(n)=f(n-2)+f(n-1)

    public void fibonaciSequence() {
        System.out.print("Podaj liczbę n: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
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
