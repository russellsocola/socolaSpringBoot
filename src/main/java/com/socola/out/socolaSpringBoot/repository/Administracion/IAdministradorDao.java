package com.socola.out.socolaSpringBoot.repository.Administracion;

import com.socola.out.socolaSpringBoot.entity.Administracion.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdministradorDao extends JpaRepository <Administrador, Long> {
}
