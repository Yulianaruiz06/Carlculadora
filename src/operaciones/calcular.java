package operaciones;

import java.util.Scanner;

public class calcular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=0, res=0;
		String sel=null;
		Scanner tec=new Scanner(System.in);
		System.out.println("Seleccione una operaci�n");
		System.out.println("+: Suma"
				+ "\n-: Resta"
				+ "\n*: Multiplicaci�n"
				+ "\n/: Divisi�n");
		sel=tec.next();
		switch(sel) {
		case "+":
			System.out.println("Ha seleccionado suma\n");
			System.out.println("Ingrese el primer n�mero");
			a=tec.nextInt();
			System.out.println("Ingrese el segundo n�mero");
			b=tec.nextInt();
			res=a+b;
			System.out.println(a+"+"+b+"="+res);
			break;
			
		case "-":
			System.out.println("ha seleccionado Resta\n");
			System.out.println("Ingrese el primer n�mero");
			a=tec.nextInt();
			System.out.println("Ingrese el segundo n�mero");
			b=tec.nextInt();
			res=a-b;
			System.out.println(a+"-"+b+"="+res);
			break;
			
		case "*":
			System.out.println("ha seleccionado Multiplicacion\n");
			System.out.println("Ingrese el primer n�mero");
			a=tec.nextInt();
			System.out.println("Ingrese el segundo n�mero");
			b=tec.nextInt();
			res=a*b;
			System.out.println(a+"*"+b+"="+res);
			break;
			
		case "/":
			System.out.println("ha seleccionado Divisi�n\n");
			System.out.println("Ingrese el primer n�mero");
			a=tec.nextInt();
			System.out.println("Ingrese el segundo n�mero");
			b=tec.nextInt();
			res=a/b;
			System.out.println(a+"/"+b+"="+res);
			break;
		}

	}

}
