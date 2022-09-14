import java.util.Scanner;

public class mediaNota {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float nota1, nota2;
        float media;
        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextFloat();

        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextFloat();

        media = (nota1 + nota2)/2;
        if (media >= 80){
            System.out.println("Aprovado");
        } else if (media < 80 && media >= 40) {
            System.out.println("Aluno em recuperação");
        } else {
            System.out.println("Reprovado");
        }
        System.out.println("A média é: " + media);

        sc.close();
    }
}
