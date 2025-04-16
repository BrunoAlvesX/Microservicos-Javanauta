package com.javanauta.cadastro_usuario.api.converter;

import com.javanauta.cadastro_usuario.api.request.EnderecoRequestDTO;
import com.javanauta.cadastro_usuario.api.request.UsuarioRequestDTO;
import com.javanauta.cadastro_usuario.api.response.EnderecoResponseDTO;
import com.javanauta.cadastro_usuario.api.response.UsuarioResponsetDTO;
import com.javanauta.cadastro_usuario.infrastructure.entities.EnderecoEntity;
import com.javanauta.cadastro_usuario.infrastructure.entities.UsuarioEntity;
import org.springframework.stereotype.Component;

@Component
public class UsuarioConverter {

    public UsuarioEntity paraUsuarioEntity(UsuarioRequestDTO usuarioDTO){
        return UsuarioEntity.builder()
                .nome(usuarioDTO.getNome())
                .documento(usuarioDTO.getDocumento())
                .email(usuarioDTO.getEmail())
                .endereco(paraEnderecoEntity(usuarioDTO.getEndereco()))
                .build();
    }

    private EnderecoEntity paraEnderecoEntity(EnderecoRequestDTO enderecoDTO){
        return EnderecoEntity.builder()
                .rua(enderecoDTO.getRua())
                .bairro(enderecoDTO.getBairro())
                .cep(enderecoDTO.getCep())
                .cidade(enderecoDTO.getCidade())
                .numero(enderecoDTO.getNumero())
                .complemento(enderecoDTO.getComplemento())
                .build();
    }

    public UsuarioResponsetDTO paraUsuarioReponseDTO(UsuarioEntity usuarioEntity){
        return UsuarioResponsetDTO.builder()
                .nome(usuarioEntity.getNome())
                .documento(usuarioEntity.getDocumento())
                .email(usuarioEntity.getEmail())
                .endereco(paraEnderecoResponseDTO(usuarioEntity.getEndereco()))
                .build();
    }

    private EnderecoResponseDTO paraEnderecoResponseDTO(EnderecoEntity enderecoEntity){
        return EnderecoResponseDTO.builder()
                .rua(enderecoEntity.getRua())
                .bairro(enderecoEntity.getBairro())
                .cep(enderecoEntity.getCep())
                .cidade(enderecoEntity.getCidade())
                .numero(enderecoEntity.getNumero())
                .complemento(enderecoEntity.getComplemento())
                .build();
    }
}
