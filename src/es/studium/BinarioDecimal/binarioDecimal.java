package es.studium.BinarioDecimal;
import java.util.Scanner;
public class binarioDecimal {

	public static void main(String[] args) {
		
		int a,b,c,d,e;
	
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el primer número binario:");
		a=teclado.nextInt();
		System.out.println("Introduce el segundo número binario:");
		b=teclado.nextInt();
		System.out.println("Introduce el tercer número binario:");
		c=teclado.nextInt();
		System.out.println("Introduce el segundo número binario:");
		d=teclado.nextInt();
		System.out.println("Introduce el tercer número binario:");
		e=teclado.nextInt();
	
		System.out.println("El número binario introducido se corresponde con el decimal: " + funCalculo(a,b,c,d,e));
		teclado.close();
	}

	public static int funCalculo(int e, int d, int c, int b, int a)
	{
	return (e*16)+(d*8)+(c*4)+(b*2)+(a*1);
}
}
