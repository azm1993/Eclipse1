import java.util.Scanner;
public class Ai {

	public static void main(String[] args) 
{
		// TODO Auto-generated method stub
		int Opcion;
	 Scanner in = new Scanner (System.in);
	 System.out.println("Bienvenido a Contax9000");
     System.out.println("1.Nombre");
     System.out.println("2.Empresa");
     System.out.println("3.Cantidad");
     Opcion = in.nextInt();
     if (Opcion==1)
     {
    	 System.out.println("Porfavor introduzca su nombre");
    	 Scanner Ks = new Scanner (System.in);
    	 String name = Ks.nextLine();
    	 System.out.println("Incluido en la base de datos");
    	 System.out.println(name);
     }
    if (Opcion==2)
     {
    	 System.out.println("Introduzca el nombre de la empresa");
    	 Scanner En = new Scanner (System.in);
    	 String name1 = En.nextLine();
    	 System.out.println("Incluido en la base de datos");
    	 System.out.println(name1);
     }
    if (Opcion==3)
    {
   	 	System.out.println("Introduzca la Cantidad Mercantil");
   	 	Scanner num = new Scanner (System.in);
   	 	int con = num.nextInt();
   	 	System.out.println("Incluido en la base de datos");
   	 	System.out.println(con);
    }
    
    }
}

