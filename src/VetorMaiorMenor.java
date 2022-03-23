import java.util.Scanner;

public class VetorMaiorMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Digite quantos elementos terá o vetor: ");
		int num = input.nextInt();
		int vetor[] = new int[num];
		int maior = 0;
		int menor = 0;

		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("");
			System.out.print("Digite o " + (i +1) + "° elemento do vetor:  ");
			int valor = input.nextInt();
			System.out.println("O índice "+ i + " recebe o valor " + valor);
			vetor[i] = valor;
			maior = vetor[i];
			menor = vetor[i];
		}
		
		for ( int i = 0; i < vetor.length; i++) {
			
			if (maior < vetor[i]) {
				maior = vetor[i];				
			} else if (menor > vetor[i]) {
				menor = vetor[i];
			}
			
		}
		   
			System.out.println("============================================");
		   System.out.println("O MAIOR valor do vetor é: " + maior + " e o MENOR é: " + menor);
		   System.out.println("============================================");
		  
		}

	}


