package com.aluracursos.literalura.model;

public enum Categoria {
    ACCION ("Action"),
    ROMANCE ("Romance"),
    CRIMEN ("Crime"),
    COMEDIA ("Comedy"),
    DRAMA ("Drama"),
    AVENTURA ("Adventure"),
    FICCION ("Fiction"),
    DESCONOCIDO("Desconocido");

    private String categoria;

    Categoria(String generoGutendex) {
        this.categoria = generoGutendex;
    }

    public static Categoria fromString(String text){
        for (Categoria generoEnum: Categoria.values()){
            if (generoEnum.categoria.equals(text)){
                return generoEnum;
            }
        }
        return Categoria.DESCONOCIDO;
    }
}
