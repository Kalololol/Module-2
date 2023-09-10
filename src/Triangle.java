public class Triangle {
    //Trójkąt;
//Stwórz funkcję, która jako argument przyjmie liczbę, a następnie na podstawie tego argumentu wydrukuj trójkąt o wysokości odpowiadającej temu argumentowi (dokonaj
// sprawdzenia, czy wysokość jest większe od 0).
//Końcowy wynik dla wartości argumentu 3 powinien wyglądać tak:
    public void triangle(int number) {
        int a = 0;
        System.out.println("Przyjęta wartość to: " + number);
        if (number > 0) {
            for (int i = number; i > 0; i--) {
                a++;
                for (int j = 0; j < a; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else System.out.println("Podana liczba to 0. Zacznij od początku.");

    }
}
