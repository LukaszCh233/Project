import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        int odp;
        int sum;
        int los1;
        int los2;
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Wpisz 1 aby wylsować pierwsza liczbe: ");
        i = scanner.nextInt();

        int liczba = rnd.nextInt(50);



        System.out.println(liczba);
        System.out.println("Wpisz 2 aby wylosowac druga liczbe: ");
        i =scanner.nextInt();

        int liczba1 = rnd.nextInt(50);

        System.out.println(liczba1);

        System.out.println("Podaj sume tych dwóch liczb:");
        odp = scanner.nextInt();

        sum = liczba + liczba1;

            if (odp == sum) {
                System.out.println("Brawo umiesz dodawac");
            }else if (odp != sum){
                    System.out.println("AJJJ POCWICZ");
                }
                sum = liczba + liczba1;
                System.out.println(" wynik to " + sum);
            }
    }
