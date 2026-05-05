import java.util.Scanner;

class Saludo {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        
        System.out.print("¿Tu nombre? ");
        System.out.println("Hola " + sc.nextLine());
    }
}