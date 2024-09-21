import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int[] numbers = new int[8];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 8 numbers into the array");
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Number " + (i + 1) + " = ");
            numbers[i] = scanner.nextInt();
        }

        int choice;
        do{
            System.out.println("\n-Menu-");
            System.out.println("1. Display the array");
            System.out.println("2. Find the maximum value");
            System.out.println("3. Calculate the sum of the elements");
            System.out.println("4. Count even and odd elements");
            System.out.println("5. Reverse the array");
            System.out.println("0. Exit");
            System.out.println("Choose an action:");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Displaying the array");
                    printArray(numbers);
                    break;
                case 2:
                    int max = findMax(numbers);
                    System.out.println("The maximum value is = " + max);
                    break;

                case 3:
                    int sum = calcSum(numbers);
                    System.out.println("The sum of elements = " + sum);
                    break;

                case 4:
                    int evenAmount = countEven(numbers);
                    int oddAmount = numbers.length - countEven(numbers);
                    System.out.println("Number of even numbers = " + evenAmount);
                    System.out.println("Number of odd numbers = " + oddAmount);
                    break;

                case 5:
                    reverseArray(numbers);
                    System.out.println("Array after inversion");
                    printArray(numbers);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("No such option, please try again");
                    break;
            }
        } while (choice != 0);
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

    public static int findMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static int calcSum(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    public static int countEven(int[] array){
        int counter = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                counter++;
            }
        }
        return counter;
    }

    public static void reverseArray(int[] array){
        int n = array.length;
        for(int i = 0; i < n / 2; i++){
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
    }
}
