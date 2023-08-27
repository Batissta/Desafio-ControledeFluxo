package areaDeCodigo;

import java.util.Scanner;
import exception.ParametrosInvalidosException;

public class Contador {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		while (true) {
			System.out.println("Digite o primeiro parâmetro: ");
			int parametroUm = Integer.parseInt(t.nextLine());
			System.out.println("Digite o segundo parâmetro: ");
			int parametroDois = Integer.parseInt(t.nextLine());
			try {
				contar(parametroUm, parametroDois);
				break;
			}catch(ParametrosInvalidosException e){
				System.out.println("O segundo parâmetro deve ser maior que o primeiro...\nTente novamente");
			}
		}
		t.close();
	}
	
	static void contar(int paramUm, int paramDois) throws ParametrosInvalidosException{
		if (paramUm >= paramDois) {
			throw new ParametrosInvalidosException();
		}
		int contagem = paramDois - paramUm;
		for(int c = 0; c<contagem;c++) {
			System.out.println(c+1);
		}
	}
}
