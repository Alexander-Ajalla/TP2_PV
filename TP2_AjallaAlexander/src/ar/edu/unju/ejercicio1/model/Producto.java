package ar.edu.unju.ejercicio1.model;

public class Producto {
	private int producto;
	private String descripcion;
	private Double precioU;
	OrigenFabricacion origen;
	Categoria categoria;
	
	public Producto() {}

	public Producto(int producto, String descripcion, Double precioU, OrigenFabricacion origen, Categoria categoria) {
		super();
		this.producto = producto;
		this.descripcion = descripcion;
		this.precioU = precioU;
		this.origen = origen;
		this.categoria = categoria;
	}

	public int getProducto() {
		return producto;
	}

	public void setProducto(int producto) {
		this.producto = producto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecioU() {
		return precioU;
	}

	public void setPrecioU(Double precioU) {
		this.precioU = precioU;
	}

	public OrigenFabricacion getOrigen() {
		return origen;
	}

	public void setOrigen(OrigenFabricacion origen) {
		this.origen = origen;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public String toString() {
		return "Producto [producto=" + producto + ", descripcion=" + descripcion + ", precioU=" + precioU + ", origen="
				+ origen + ", categoria=" + categoria + "]";
	}

}
