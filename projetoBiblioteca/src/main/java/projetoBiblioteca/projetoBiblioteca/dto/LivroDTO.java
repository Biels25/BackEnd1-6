package projetoBiblioteca.projetoBiblioteca.dto;

import projetoBiblioteca.projetoBiblioteca.model.Livro;

public class LivroDTO {
    private  String titulo;
    private String autor;
    private Long isbn;
    private String genero;

    public static LivroDTO fromEntity(Livro livro) {
        LivroDTO dto = new LivroDTO();
        dto.setTitulo(livro.getTitulo());
        dto.setAutor(livro.getAutor());
        dto.setIsbn(livro.getIsbn());
        dto.setGenero(livro.getGenero());
        return dto;
    }
    public static Livro fromDTO(LivroDTO dto) {
        Livro livro = new Livro();
        livro.setTitulo(dto.getAutor());
        livro.setAutor(dto.getAutor());
        livro.setIsbn(dto.getIsbn());
        livro.setGenero(dto.getGenero());
        return livro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
