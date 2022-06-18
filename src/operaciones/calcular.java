package operaciones;

import java.util.Scanner;

public class calcular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=0, res=0;
		String sel=null;
		Scanner tec=new Scanner(System.in);
		System.out.println("Seleccione una operación");
		System.out.println("+: Suma"
				+ "\n-: Resta"
				+ "\n*: Multiplicación"
				+ "\n/: División");
		sel=tec.next();
		switch(sel) {
		case "+":
			System.out.println("Ha seleccionado suma\n");
			System.out.println("Ingrese el primer número");
			a=tec.nextInt();
			System.out.println("Ingrese el segundo número");
			b=tec.nextInt();
			res=a+b;
			System.out.println(a+"+"+b+"="+res);
			break;
			
		case "-":
			System.out.println("ha seleccionado Resta\n");
			System.out.println("Ingrese el primer número");
			a=tec.nextInt();
			System.out.println("Ingrese el segundo número");
			b=tec.nextInt();
			res=a-b;
			System.out.println(a+"-"+b+"="+res);
			break;
			
		case "*":
			System.out.println("ha seleccionado Multiplicacion\n");
			System.out.println("Ingrese el primer número");
			a=tec.nextInt();
			System.out.println("Ingrese el segundo número");
			b=tec.nextInt();
			res=a*b;
			System.out.println(a+"*"+b+"="+res);
			break;
			
		case "/":
			System.out.println("ha seleccionado División\n");
			System.out.println("Ingrese el primer número");
			a=tec.nextInt();
			System.out.println("Ingrese el segundo número");
			b=tec.nextInt();
			res=a/b;
			System.out.println(a+"/"+b+"="+res);
			break;
		}

	}

}
