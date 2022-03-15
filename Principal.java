import java.util.Scanner;
public class Principal {
    public static void main(String[] jony ){
        Quadrado quadrado =new Quadrado();
        System.out.println("Digite um lado");
        Scanner sc= new Scanner(System.in);
        quadrado.setLado(sc.nextDouble());
                             
        sc.close();
             
    }
    
}
