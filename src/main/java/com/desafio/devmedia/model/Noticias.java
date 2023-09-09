package com.desafio.devmedia.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Noticias {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "Adicione um título à notícia")
    private String titulo;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
    @NotNull(message = "Adicione um conteúdo à notícia")
    @Column(columnDefinition = "TEXT")
    private String conteudo;

}
