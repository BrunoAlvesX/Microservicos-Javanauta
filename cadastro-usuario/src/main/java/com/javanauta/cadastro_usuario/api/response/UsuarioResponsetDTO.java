package com.javanauta.cadastro_usuario.api.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioResponsetDTO {

    private Long id;

    private String nome;

    private String email;

    private String documento;

    private EnderecoResponseDTO endereco;
}
