package br.com.alura.screnmatch2.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe); //Utilizado quando não se sabe os tipos de dados que serão importados, está de forma genérica, o segundo atributo é necessário para indicar que tipo de retorno será realizado, como não foi indicado no cabeçalho da classe o tipo de retorno ele será indicado neste atributo

}
