package com.socola.out.socolaSpringBoot.repository.Administracion;

import com.socola.out.socolaSpringBoot.entity.Administracion.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteDao extends JpaRepository <Cliente, Long> {
}
