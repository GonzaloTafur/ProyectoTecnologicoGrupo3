package com.DietasYRutinasOnline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DietasYRutinasOnline.entity.TransaccionUsuario;

@Repository
public interface TransUsuarioRepository extends JpaRepository<TransaccionUsuario, Integer> {

}
