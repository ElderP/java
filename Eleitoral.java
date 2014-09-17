package base;

public class Eleitoral {
	//atributos
	String nome;
	int idade;
	
	//metodos
	void verificar() {
		
		if (idade < 16)
			System.out.println("eleitor não pode votar");
		else if (idade >= 18 && idade <= 65)
			System.out.println("eleitor deve votar");
		else
			System.out.println("voto facultativo");
	}
	
	void imprimir() {
		verificar();
	}
}
