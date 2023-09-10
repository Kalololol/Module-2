public class MoreOrLess {
    //Napisz funkcję, która pobierze od użytkownika liczbę, następnie sprawdź przy użyciu funkcji warunkowych, czy jest większa, czy mniejsza od zera i wydrukuj wynik sprawdzenia
    public String moreOrLess(int number){
        if(number > 0) return "Greather than zero";
        else if(number < 0) return  "Less than zero";
        else if(number == 0) return "Equal zero";
        else return "Wrong data";
    }
}
