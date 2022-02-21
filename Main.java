import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com uma palavra para saber quantos anagramas pares ela possui:");
        String palavra = scanner.nextLine();
        int cont = 1;
        int contAna = 0;
        int anagr = 0;

        for(int i = 0; i < palavra.toCharArray().length; ++i) {
            for(int j = 0; j + cont <= palavra.toCharArray().length; ++j) {
                for(int k = j + 1; k + cont <= palavra.toCharArray().length; ++k) {
                    char[] a = palavra.substring(j, j + cont).toCharArray();
                    char[] b = palavra.substring(k, k + cont).toCharArray();

                    for(int l = 0; l < a.length; ++l) {
                        for(int m = 0; m < a.length; ++m) {
                            if (Character.toLowerCase(a[l]) == Character.toLowerCase(b[m])) {
                                ++contAna;
                                b[m] = " ".charAt(0);
                                a[l] = "/".charAt(0);
                            }
                        }

                        if (contAna >= a.length) {
                            ++anagr;
                        }
                    }

                    contAna = 0;
                }
            }

            ++cont;
        }

        System.out.println("A quantidade de anagramas encontrada é: " + anagr);
    }
}
