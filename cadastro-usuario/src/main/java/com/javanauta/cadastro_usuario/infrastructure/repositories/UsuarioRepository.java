package com.javanauta.cadastro_usuario.infrastructure.repositories;

import com.javanauta.cadastro_usuario.infrastructure.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}
