import java.util.Scanner; 

public class BemVindo {
    public static void main(String[] args) {
        String nome; 
        int idade; 
        double altura;
        Scanner entrada = new Scanner(System.in); 
        
        System.out.print("Digite seu nome: "); 
<<<<<<< HEAD
        nome = entrada.nextLine(); 
=======
        nome = entrada.nextLine();

>>>>>>> 3cf00a3972bd3284b5fdc554b471291d126038cc
        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();
        
        System.out.print("Digite sua altura: ");
        altura = entrada.nextDouble();

        System.out.println("Olá, " + nome + "! Sua idade é " + idade + " e sua altura é " + altura + ".");
        
        entrada.close(); 
    }
}
