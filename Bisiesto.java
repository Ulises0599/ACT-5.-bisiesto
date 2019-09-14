import java.util.Scanner;
public class Bisiesto {
    
    public static void main(String[] args) {
   Scanner sc =new Scanner(System.in);
   int anio;
    System.out.println("Introduce el año que deseas: ");
  anio = sc.nextInt();

  if((anio % 4 == 0 && anio % 100 != 0)|| anio % 400 == 0)
    {
    System.out.println("Es año bisiesto");
    }
    else 
  {
    System.out.println("No es bisiesto");
    }
    }
    }
