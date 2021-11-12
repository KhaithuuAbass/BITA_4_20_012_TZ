import java.util.Scanner;
class QN4{
    public static void main(String[]args){
        Scanner car = new Scanner(System.in);
        System.out.println("Enter number of gallons of gas in tank ");
        double GasInTank = car.nextDouble();

        System.out.println("Enter number of miles per gallons ");
        double milesPerGallon=car.nextDouble();
        System.out.println("Enter price of gas per gallon ");
        double Price = car.nextDouble();

        double Distance = milesPerGallon * GasInTank;
        System.out.println("The distance that the car can travell with gas is: "+Distance );
        double cost = (250/milesPerGallon) * Price;
        System.out.println("The cost of travelling 250 miles with car is "+cost);

    }




}