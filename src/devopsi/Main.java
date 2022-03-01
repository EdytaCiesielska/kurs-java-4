package devopsi;

public class Main {
    /*
    Stwórz Klasę zgodnie z obrazkiem i :
    Stwórz obiekt takiej klasy wraz z liczbami [-1,2,50,100] przekazanymi w konstruktorze
    Stwórz odpowiednie interfaces zgodnie z metodami definiującymi operacje dodawania, liczenia średniej i wyświetlania liczb większych od 2.
    Stwórz odpowiednie lambdy do wszystkich metod i zademonstruj ich działanie na zasadzie tego co dana funkcja zrobi po otrzymaniu obiektu lambdy.
     */

    public static void main(String[] args) {

        int[] numbers = {-1,2,50,100};
        Numbers tabNumbers = new Numbers(numbers);

        Lambda1 lambda1 = (int[] number1) -> {

            int sum = 0;
            for (int i = 0; i < number1.length; i++) {
                sum = sum + number1[i];
            }
            return sum;
       };

        Lambda2 lambda2 = (int[] number2) -> lambda1.add(number2) / number2.length;

        Lambda3 lambda3 = (int[] number3) -> {
            System.out.print("Liczby z tabeli większe od 2 to: ");
            for (int i = 0; i < number3.length; i++) {
                if (number3[i] > 2) System.out.print(number3[i] + " ");
            }
        };

        System.out.println("Suma liczba wynosi: " + tabNumbers.add(lambda1));
        System.out.println("Średnia liczb wynosi: " + tabNumbers.avg(lambda2));
        tabNumbers.show(lambda3);
    }
}
