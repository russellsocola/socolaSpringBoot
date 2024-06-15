package com.socola.out.socolaSpringBoot.repository.Administracion;

import com.socola.out.socolaSpringBoot.entity.Administracion.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProveedorDao extends JpaRepository <Proveedor, Long> {
}
