import java.util.Scanner;

public class Uni2Exer09 {
public static void main(String[] args) {
    float reais, dolares;
    
    Scanner tec = new Scanner(System.in);

    System.out.println("Quantos você tem (em reais): ");
    reais = tec.nextFloat();

    dolares = reais / 5.22f;

    System.out.println("Você converteu " + reais + "R$ em " + dolares + "doláres");

}
}
