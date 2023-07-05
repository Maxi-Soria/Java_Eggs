package maxi.guiapoo.entidades;

import java.util.Scanner;

/**
 *Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos pasados por parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas.
 * @author MAXI
 */
public class Libro {
    private String _isbn;
    private String _titulo;
    private String _autor;
    private int _paginas;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, int paginas) {
        _isbn = isbn;
        _titulo = titulo;
        _autor = autor;
        _paginas = paginas;
    }

    public String getIsbn() {
        return _isbn;
    }

    public void setIsbn(String _isbn) {
        this._isbn = _isbn;
    }

    public String getTitulo() {
        return _titulo;
    }

    public void setTitulo(String _titulo) {
        this._titulo = _titulo;
    }

    public String getAutor() {
        return _autor;
    }

    public void setAutor(String _autor) {
        this._autor = _autor;
    }

    public int getPaginas() {
        return _paginas;
    }

    public void setPaginas(int _paginas) {
        this._paginas = _paginas;
    }
    
    public void Cargar(){
        Scanner leer = new Scanner (System.in);
        
        String isbn, titulo, autor;
        int paginas;
        
        System.out.print("Ingrese el ISBN: ");
        setIsbn(leer.nextLine());
        
        System.out.print("Ingrese el Titulo: ");
        setTitulo(leer.nextLine());
        
        System.out.print("Ingrese el Autor: ");
        setAutor(leer.nextLine());
        
        System.out.print("Ingrese las paginas: ");
        setPaginas(leer.nextInt());
        
    }

    @Override
    public String toString() {
        return "Libro" + "\nIsbn= " + _isbn + "\nTitulo= " + _titulo + "\nAutor= " + _autor + "\nPaginas= " + _paginas;
    }

    

    
    
}
