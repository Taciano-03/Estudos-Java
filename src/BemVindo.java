import java.util.Scanner; 

public class BemVindo {
    public static void main(String[] args) {
        String nome; 
        int idade; 
        double altura;
        Scanner entrada = new Scanner(System.in); 
        
        System.out.print("Digite seu nome: "); 
        nome = entrada.nextLine(); 
        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();
        
        System.out.print("Digite sua altura: ");
        altura = entrada.nextDouble();

        System.out.println("Olá, " + nome + "! Sua idade é " + idade + " e sua altura é " + altura + ".");
        
        entrada.close(); 
    }
}
