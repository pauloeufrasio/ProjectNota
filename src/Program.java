import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Studant studant = new Studant();

        System.out.print("Digite seu nome: ");
        studant.setName(sc.nextLine());
        System.out.println("Olá " +studant.getName()+ " Digite suas notas abaixo: ");
        studant.setGrade1(sc.nextDouble());
        studant.setGrade2(sc.nextDouble());

        System.out.printf("Final Grade %.2f%n",studant.finalGrade());

        if (studant.finalGrade() < 60.0){
            System.out.println("Falhou");
            System.out.printf("olá " +studant.getName() +" Faltou %.2f Pontos%n pra voce passar boa sorte",studant.missingPoints());
        }
        else {
            System.out.println("Passou "+studant.getName()+" Parabens");
        }
        sc.close();
    }
}