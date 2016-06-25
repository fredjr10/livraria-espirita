/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;



/**
 *
 * @author alfredo
 */
@Entity
public class Livro implements Serializable {
    
    @Id 
    @GeneratedValue
    private int id;
    
    private String titulo;
    private String autor;
    private String espirito;
    private String tradutor;
    private String editora;
    private int anoEdicao;
    private String isbn;

    public Livro() {
    }

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

    public String getEspirito() {
        return espirito;
    }

    public void setEspirito(String espirito) {
        this.espirito = espirito;
    }

    public String getTradutor() {
        return tradutor;
    }

    public void setTradutor(String tradutor) {
        this.tradutor = tradutor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoEdicao() {
        return anoEdicao;
    }

    public void setAnoEdicao(int anoEdicao) {
        this.anoEdicao = anoEdicao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
         
}
