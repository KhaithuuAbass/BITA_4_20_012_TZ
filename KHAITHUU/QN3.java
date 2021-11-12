import java.util.Scanner;
class QN3{
    public static void main(String[]args){
        int participent;
        int revenue;

        Scanner reve = new Scanner(System.in);
        System.out.println("Enter a number of participants ");
        participent = reve.nextInt();

        revenue = 2500 * participent;

        System.out.println("The revenue obtained for the tour is " +revenue);
    }
}