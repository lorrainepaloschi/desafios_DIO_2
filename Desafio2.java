import java.io.IOException;
import java.util.Scanner;

public class  Desafio2 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        float soma = 0;
        int n = 1;
        while (n > 0) {
            n = leitor.nextInt();
            if (n > 0 ) { 
                soma+=n;
                cont++;
            }
        }
        double media = soma / cont;
        System.out.println(String.format("%.2f", media));
    }
	
}