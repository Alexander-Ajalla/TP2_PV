package ar.edu.unju.ejercicio1.main;

import java.util.List;
import java.util.Scanner;

import ar.edu.unju.ejercicio1.model.Producto;

public class Main {
	private static Scanner scanner;
	private static List<Producto> productos;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int option = 0;
			do {
				System.out.println("-------------------------");
				System.out.println("1 - Crear Productos");
				System.out.println("2 - Mostrar Productos");
				System.out.println("3 - Modificar producto");
				System.out.println("4 - Salir");
				System.out.println("-------------------------");
				System.out.println("Ingrese una opcion: ");
				option = scanner.nextInt();
				scanner.nextLine();
				switch (option) {
				case 1: 
					System.out.println("Crear Productos");
					break;
				case 2:
					System.out.println("Mostrar Productos");
					break;
				case 3:
					System.out.println("Modificar Producto");
					break;
				case 4: 
					System.out.println("Fin del programa");
				default:
					System.out.println("Opcion incorrecta");
					break;
				} 
			} while(option !=4);
	}
}
