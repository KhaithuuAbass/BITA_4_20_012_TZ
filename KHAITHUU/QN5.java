import java .util.Scanner;
class QN5{
    public static void main(String[]args){
        int egg;
        int gross;
        int dozen;
        int remain;
        Scanner food = new Scanner(System.in);
        System.out.println("Enter number of Eggs:");
        egg = food.nextInt();
    
        gross= egg/144;
        remain = egg - (gross * 144);
        dozen = remain/12;
        remain = remain-(dozen* 12);

        System.out.println("gross: "+gross+"\n Dozen: "+dozen+"\n Remain: "+remain+"");
    }
}