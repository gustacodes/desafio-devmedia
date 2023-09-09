package com.desafio.devmedia.componentes;

import com.desafio.devmedia.model.Categoria;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToCategoriaConverter implements Converter<String, Categoria> {

    @Override
    public Categoria convert(String source) {
        return new Categoria(source);
    }
}
