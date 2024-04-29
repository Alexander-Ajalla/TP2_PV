package ar.edu.unju.ejercicio1.model;

public class Producto {
	private Integer codigo;
	private String descripcion;
	private Double precioU;
	OrigenFabricacion origen;
	Categoria categoria;
	
	public enum OrigenFabricacion {
		ARGENTINA,CHINA,
		BRASIL,URUGUAY;
	}
	public enum Categoria {
		TELEFONIA,INFORMATICA,
		ELECTROHOGAR,HERRAMIENTAS;
	}
	public Producto() {}

	public Producto(Integer codigo, String descripcion, Double precioU, OrigenFabricacion origen, Categoria categoria) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioU = precioU;
		this.origen = origen;
		this.categoria = categoria;
	}
	
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precioU=" + precioU + ", origen="
				+ origen + ", categoria=" + categoria + "]";
	}
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
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

}
