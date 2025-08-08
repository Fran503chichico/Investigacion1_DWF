package Videojuegos;

import jakarta.persistence.*;

@Entity
public class Videojuego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String genero;
    private String plataforma;
    private double precio;

    public Videojuego() {
    }

    public Videojuego(String titulo, String genero, String plataforma, double precio) {
        this.titulo = titulo;
        this.genero = genero;
        this.plataforma = plataforma;
        this.precio = precio;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public String getPlataforma() { return plataforma; }
    public void setPlataforma(String plataforma) { this.plataforma = plataforma; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
}