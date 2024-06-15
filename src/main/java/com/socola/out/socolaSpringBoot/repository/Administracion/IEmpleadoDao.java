package com.socola.out.socolaSpringBoot.repository.Administracion;

import com.socola.out.socolaSpringBoot.entity.Administracion.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleadoDao extends JpaRepository <Empleado, Long> {
}
