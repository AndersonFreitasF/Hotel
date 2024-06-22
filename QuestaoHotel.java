package questao;
import java.util.Locale;
import java.util.Scanner;

import entidades.Hospedes;

public class QuestaoHotel {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	System.out.println("Quantos quartos serão alugados?");
	int q = sc.nextInt();
	Hospedes v[] = new Hospedes [q];
	if (q <10) {
	for(int i=0; i<q;i++) {
		System.out.println("Digite o nome do hospede:");
		String nome = sc.next();
		System.out.println("Digite o email do hospede:");
		String email = sc.next();
		System.out.println("Digite o quarto ocupado:");
		int quarto = sc.nextInt();
		v[i] = new Hospedes(quarto,email,nome);
	}
	System.out.println("Quartos ocupados:");
	for (int i= 0; i < v.length; i++) {
	System.out.println( v[i]); 
	sc.close();
	}
	}
	else {
		System.out.println("Limite maximo de 10 hospedes");
	}
	
}
}

