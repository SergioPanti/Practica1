
public class Prestamo {
	
	int id;
	String titulo;
	String autor;
	String editorial;
	Integer año;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public Integer getAño() {
		return año;
	}
	public void setAño(Integer año) {
		this.año = año;
	}
	@Override
	public String toString() {
		return "Prestamo [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + ", año="
				+ año + "]";
	}
	
	
	
}
