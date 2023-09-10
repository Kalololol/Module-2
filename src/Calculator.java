import java.util.Scanner;

public class Calculator {
    //Kalkulator
    //Napisz program, który przyjmie od użytkownika 3 wartości: 2 liczby oraz operację, która powinna zostać
    // przeprowadzona: +, -, *, / (dodawanie, odejmowanie, mnożenie, dzielenie). Dodatkowo, użytkownik powinien
    // móc wykonywać kolejne operacje, aż do wpisania przez niego kończącej komendy (przykładowo: exit, quit);
    //Program powinien zawierać następujące operacje: Wyświetlenie instrukcji przy pierwszym uruchomieniu, pobranie liczb, pobranie operacji
    // (co wyświetlić użytkownikowi, jeśli wybierze złą/niewspieraną operację?), wykonanie operacji, wydrukowanie wyniku oraz zapytanie o kontynuację działań.
    //Jakie warunki powinny spełniać liczby? Jakie warunki powinny spełniać podane komendy (pamiętaj o porównaniu Stringów przez użycie metody equals!)?

    public void inputData() {
        double firstNum, secondNum;
        String inputChar, inputExit;
        Scanner input = new Scanner(System.in);
        double result;
        boolean exit = true;

        do {
            System.out.println("Witaj w Kalkulatorze!");
            System.out.println("Wprowadź dane:");
            System.out.println("Podaj pierwszą liczbę: ");
            firstNum = input.nextDouble();
            System.out.println("Podaj drugą liczbę: ");
            secondNum = input.nextDouble();
            System.out.println("Wprowadź typ operacji: ");
            System.out.println("Dozwolone znaki operacji: + - * /");
            inputChar = input.next();

            switch (inputChar) {
                case "+":
                    System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
                    break;
                case "-":
                    System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
                    break;
                case "*":
                    System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
                    break;
                case "/":
                    if(secondNum == 0) System.out.println("Nie można dzielić przez zero, zacznij od nowa");
                    else System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
                    break;
                default:
                    System.out.println("Wprowadzone wartości są niepoprawne, spróbuj jeszcze raz!");
            }
            boolean exitExit = true;
            do {
                System.out.println("Czy chcesz zakończyć?");
                System.out.println("Wybierz Y / N");
                inputExit = input.next().toUpperCase();

                switch (inputExit){
                    case "Y":
                        exit = false;
                        exitExit = true;
                        break;
                    case "N":
                        exit = true;
                        exitExit = true;
                        break;
                    default:
                        System.out.println("UPS! Coś poszło nie tak, spróbuj ponownie");
                        exitExit = false;
                }
            }while(!exitExit);


        } while (exit);
        System.out.println("Koniec!");
    }

}
