package com.aluracursos.literalura.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase); // las T colocadas de esa manera significa que el dato es generico
}
