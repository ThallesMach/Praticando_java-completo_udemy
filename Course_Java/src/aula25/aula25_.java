
//--->> Dicas
//•Comentários de linha:
//    •Começam com //
//•Atalhos:
//    •Importar classes: CTRL + SHIFT + O
//    •Autoendentação: CTRL + SHIFT + F
//    •sysoutCTRL + espaço
    
//	---> Seção-4 Aula 25 Processamento de dados em Java, Casting

package aula25;

public class aula25_ {

	public static void main(String[] args) {
		
//		System.out.println(" Teste Aula 25");
		
//		--> Exemplo 1
//		int x, y;
//		x = 5;
//		y = 2 * x;
//		System.out.println(x);
//		System.out.println(y);

		System.out.println("-------------------");
//		---> Exemplo 2
		int x;
		double y;
		x = 5;
		y = 2 * x;
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("-------------------");
//		---> Exemplo 3		
//		double b, B, h, area;
//		b = 6.0;
//		B = 8.0;
//		h = 5.0;
//		area= (b + B) / 2.0 * h;
//		System.out.println(area);
		
		System.out.println("-------------------");
//		Boa prática:
//			Sempre indique o tipo do número,
//			se a expressão for de ponto flutuante (não inteira).
//				Para doubleuse: .0
//				Para floatuse: f

//		double b, B, h, area;
//		b = 6.0;
//		B = 8.0;
//		h = 5.0;
//		area= (b + B) / 2.0 * h;
//		System.out.println(area);

		System.out.println("-------------------");		
//		float b, B, h, area;
//		b = 6f;
//		B = 8f;
//		h = 5f;
//		area= (b + B) / 2f * h;
//		System.out.println(area);

		System.out.println("-------------------");		
//		---> Exemplo 4
		int a, b;
		double resultado;
		a = 5;
		b = 2;
		resultado = a / b;
		System.out.println(resultado);
		
		System.out.println("-------------------");
		
		double p;
		int r;
		p = 5.0;
		r = (int) p;
		System.out.println(r);
		System.out.println("-------------------");
		
		
		
	}

}
