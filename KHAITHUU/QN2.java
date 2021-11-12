import java.util.Scanner;
class QN2{
    public static void main(String[]args){
        Scanner game = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = new String();
        name = game.nextLine();
       System.out.println("Enter your city: ");
        String city = new String();
        city = game.nextLine();
        System.out.println("Enter your age: ");
        String age = new String();
        age = game.nextLine();
        System.out.println("Enter your collage: ");
        String collage = new String();
        collage = game.nextLine();
        System.out.println("Enter your profession: ");
        String profession = new String();
        profession = game.nextLine();
        System.out.println("Enter your Animal Type: ");
        String animal = new String();
        animal = game.nextLine();   
        System.out.println("Enter your pet's name: ");
        String pet = new String();
        pet = game.nextLine();
        System.out.print( "There once was a person named " + name + " who lived in " + city + ".At the  age of " + age + "." + name + "went to collage at" + collage + "." +name + 
        "graduated and went to work as a " +profession+". Then, "+name+"adopted a(n) "+animal+" named "+pet+" They both lived happily ever after");

    }
}