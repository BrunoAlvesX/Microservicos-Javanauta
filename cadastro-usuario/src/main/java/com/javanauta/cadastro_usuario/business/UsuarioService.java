package com.javanauta.cadastro_usuario.business;

import com.javanauta.cadastro_usuario.api.converter.UsuarioConverter;
import com.javanauta.cadastro_usuario.api.request.UsuarioRequestDTO;
import com.javanauta.cadastro_usuario.api.response.UsuarioResponsetDTO;
import com.javanauta.cadastro_usuario.infrastructure.entities.UsuarioEntity;
import com.javanauta.cadastro_usuario.infrastructure.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    private UsuarioEntity salvaUsuario(UsuarioEntity usuarioEntity){

        return usuarioRepository.saveAndFlush(usuarioEntity);
    }

    public UsuarioResponsetDTO gravarUsuarios(UsuarioRequestDTO usuarioRequestDTO){
        try {
            UsuarioEntity usuarioEntity = salvaUsuario(usuarioConverter.paraUsuarioEntity(usuarioRequestDTO));
            return usuarioConverter.paraUsuarioReponseDTO(usuarioEntity);
        }
    }
}
