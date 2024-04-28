package ar.edu.unju.ejercicio1.main;

import java.util.List;
import java.util.Scanner;

import ar.edu.unju.ejercicio1.model.Categoria;
import ar.edu.unju.ejercicio1.model.OrigenFabricacion;
import ar.edu.unju.ejercicio1.model.Producto;


public class Main {
	private static Scanner scanner;
	private static List<Producto> productos;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
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
				case 1: crearProducto();
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
	
	public static void crearProducto () {
		Producto producto = new Producto();
		
		System.out.println("Ingrese el código del producto: ");
		producto.setCodigo(scanner.nextInt());
		
		System.out.println("Ingrese la descripción del producto: ");
		producto.setDescripcion(scanner.next());
		
		double precio;
		while (true) {
			System.out.println("Ingrese el precio del producto: ");
		    String input = scanner.nextLine();
		    try {
		    	precio = Double.parseDouble(input);
		        break;
		    } catch (NumberFormatException e) {
		    	System.out.println("xxx Tipo de dato no valido xxx");
		    }
		 }
		producto.setPrecioU(precio);
		
		OrigenFabricacion origenFabricacion = obtenerOrigenFabricacion();
		producto.setOrigen(origenFabricacion);
		
		Categoria categoria = obtenerCategoria();
		producto.setCategoria(categoria);
		
		productos.add(producto);
		System.out.println("Producto creado :D");
	}
	
	public static OrigenFabricacion obtenerOrigenFabricacion () {
		int opcion = 0;
		do {
			System.out.println("---- Origen de Fabricación ----");
			System.out.println("1 - Argentina");
			System.out.println("2 - China");
			System.out.println("3 - Brasil");
			System.out.println("4 - Uruguay");
			System.out.println("Elija una opcion: ");
			
			if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();
                if (opcion < 1 || opcion > 4) {
                    System.out.println("Opción no válida. Intente nuevamente...");
                }
            } else {
                scanner.nextLine();
                System.out.println("Opción no válida. Intente nuevamente...");
            }
		} while(opcion < 1 || opcion > 4);
		
		OrigenFabricacion origen = 
				OrigenFabricacion.values()[opcion - 1];
		return origen;
	}
	public static Categoria obtenerCategoria () {
		int opcion_categoria = 0;
		do {
			System.out.println("---- Categoria ----");
			System.out.println("1 - Telefonía");
			System.out.println("2 - Informática");
			System.out.println("3 - Electro hogar");
			System.out.println("4 - Herramientas");
			System.out.println("Elija una opcion: ");
			
			if (scanner.hasNextInt()) {
                opcion_categoria = scanner.nextInt();
                scanner.nextLine();
                if (opcion_categoria < 1 || opcion_categoria > 4) {
                    System.out.println("Opción no válida. Intente nuevamente...");
                }
            } else {
                scanner.nextLine();
                System.out.println("Opción no válida. Intente nuevamente...");
            }
		} while(opcion_categoria < 1 || opcion_categoria > 4);
		
		Categoria categoria = 
				Categoria.values()[opcion_categoria - 1];
		return categoria;
	}
}
