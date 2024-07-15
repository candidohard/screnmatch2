package br.com.alura.screnmatch2.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDados implements IConverteDados {
    private ObjectMapper mapper = new ObjectMapper(); //Ferramenta de tradução utilizada pelo JACKSON


    @Override
    public <T> T obterDados(String json, Class<T> classe) { //metodo criado para implementar a interface
        try {
            return mapper.readValue(json, classe); //Retorno esperado onde será pegado o Json e pega a classe para converter, vai indicar um erro e será feito um Try/Catch
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}
