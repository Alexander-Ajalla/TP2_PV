package ar.edu.unju.ejercicio1.main;

import java.util.List;
import java.util.Scanner;

import ar.edu.unju.ejercicio1.model.Producto;
import ar.edu.unju.ejercicio1.model.Producto.OrigenFabricacion;
import ar.edu.unju.ejercicio1.model.Producto.Categoria;

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
				case 1:
					crearProducto();
					break;
				case 2:
					mostrarProducto();
					break;
				case 3:
					modificarProducto();
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
		OrigenFabricacion origen = obtenerOrigenFabricacion();
		producto.setOrigen(origen);
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
                    System.out.println("Opncion invalida");
                }
            } else {
                scanner.nextLine();
                System.out.println("Opcion invalida");
            }
		} while(opcion < 1 || opcion > 4);
		
		OrigenFabricacion origen = 
				OrigenFabricacion.values()[opcion - 1];
		return origen;
	}
	public static Categoria obtenerCategoria () {
		int opcion = 0;
		do {
			System.out.println("---- Categoria ----");
			System.out.println("1 - Telefonia");
			System.out.println("2 - Informatica");
			System.out.println("3 - Electro hogar");
			System.out.println("4 - Herramientas");
			System.out.println("Elija una opcion: ");
			
			if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();
                if (opcion < 1 || opcion > 4) {
                    System.out.println("Opcion invalida");
                }
            } else {
                scanner.nextLine();
                System.out.println("Opcion invalida");
            }
		} while(opcion < 1 || opcion > 4);
		
		Categoria categoria = Categoria.values()[opcion - 1];
		return categoria;
	}
	
	public static void mostrarProducto() {
		if (productos.isEmpty()) {
			System.out.println("La lista de producto esta vacía");
		} else {
			System.out.println("---- Lista de productos ----");
			productos.forEach(product -> System.out.println(product));			
		}
	}
	
	public static void modificarProducto () {
		if (productos.isEmpty()) {
			 System.out.println("Lista de productos vacía...");
	    } else {
	        System.out.print("Ingrese el código del producto a modificar: ");
	        String codigo = scanner.nextLine();
	        Producto productoFounded = null;
	        for (Producto producto : productos) {
	        	if (producto.getCodigo().equals(codigo)) {
	        		productoFounded = producto;
	        		break;
	             }
	        }
	        if (productoFounded == null) {
	        	System.out.println("Producto no encontrado.");
	        } else {
	        	int opcion = 0;
	        	do {
	        		System.out.println("---- Modificar Producto ----");
	                System.out.println("1 - Descripción");
	                System.out.println("2 - Precio");
	                System.out.println("3 - Origen de Fabricación");
	                System.out.println("4 - Categoría");
	                System.out.println("5 - Salir");
	                System.out.print("Elija una opción: ");
	                
	                opcion = scanner.nextInt();
	                scanner.nextLine(); 
	                
	                switch (opcion) {
						case 1: 
							System.out.println("Ingrese la nueva descripción del producto:");
							productoFounded.setDescripcion(scanner.nextLine());
							break;
						case 2:
							double precio;
							while (true) {
								System.out.println("Ingrese el nuevo precio del producto:");
							    String input = scanner.nextLine();
							    try {
							    	precio = Double.parseDouble(input);
							        break;
							    } catch (NumberFormatException e) {
							    	System.out.println("Tipo de dato no válido");
							    }
							 }
							productoFounded.setPrecioU(precio);
							break;
						case 3:
							OrigenFabricacion origen = obtenerOrigenFabricacion();
							productoFounded.setOrigen(origen);
							break;
						case 4:
							Categoria categoria = obtenerCategoria();
							productoFounded.setCategoria(categoria);
							break;
						case 5:
							System.out.println("...Fin de la modificacioon");
							break;
						default:
							System.out.println("xxxx Opcion incorrecta xxxx");
							break;
					}
	        	} while(opcion != 5);    	
	        	
                System.out.println("El producto ha hizo modificado :D");
	        }
	    }
	}
}
