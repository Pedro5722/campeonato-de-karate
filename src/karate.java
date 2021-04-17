
import java.util.Scanner;

public class karate {

	public static void main(String[] args) {
		System.out.println("==============Campeonato de karatê================");
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Qual o seu nome?");
		String nome = leia.next();
		System.out.println("Qual a sua idade?");
		int idade = leia.nextInt();
		System.out.println("Você está apto para a " ); 
		if (idade < 7) {
			System.out.println("Você ainda é um jovem gafanhoto, tente novamente próximo ano");
		} else if (idade >=7 && idade <= 10) {
			System.out.println("Categoria infantil!");
		} else if (idade >=11 && idade <= 14) {
			System.out.println("Categoria juvenil I!");
		} else if (idade >=15 && idade <= 18) {
			System.out.println("Categoria juvenil II!");
		} else if (idade >=19 && idade <= 49) {
			System.out.println("Categoria Adulto!");
		} else if (idade >=50 && idade <= 75 ) {
			System.out.println("Categoria Master!");
		} else if (idade >=11 && idade <= 14) {
			System.out.println("Você não está apto a nenhuma das nossas categorias :( ");
			
				
			
		};
		
		
	}

}
