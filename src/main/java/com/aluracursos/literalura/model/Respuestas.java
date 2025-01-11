package com.aluracursos.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Respuestas {
    @JsonAlias("results")
    List<DatosLibro> resultadoLibros;
    public List<DatosLibro> getResultadoLibros() {
        return resultadoLibros;
    }
    public void setResultadoLibros(List<DatosLibro> resultadoLibros) {
        this.resultadoLibros = resultadoLibros;
    }
}
