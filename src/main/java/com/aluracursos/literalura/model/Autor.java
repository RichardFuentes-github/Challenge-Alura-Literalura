package com.aluracursos.literalura.model;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "autores")
public class Autor {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nombre;

        private Integer cumpleanios;

        private Integer fechaFallecimiento;

        @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)

        private List<Libro> libros;


        public Autor() {
        }

        public Long getId() {
            return id;
        }

        public String getNombre() {
            return nombre;
        }

        public Integer getCumpleanios() {
            return cumpleanios;
        }

        public Integer getFechaFallecimiento() {
            return fechaFallecimiento;
        }

        public List<Libro> getLibros() {
            return libros;
        }

        public void setLibros(List<Libro> libros) {
            this.libros = libros;
        }

        public Autor(com.aluracursos.literalura.model.DatosAutor autor) {
            this.nombre = autor.nombre();
            this.cumpleanios = autor.fechaNacimiento();
            this.fechaFallecimiento = autor.fechaFallecimiento();
        }

        @Override
        public String toString() {
            return
                    "nombre='" + nombre + '\'' +
                            ", cumpleanios=" + cumpleanios +
                            ", fechaFallecimiento=" + fechaFallecimiento;
        }
}
