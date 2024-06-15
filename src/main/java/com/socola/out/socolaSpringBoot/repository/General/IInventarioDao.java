package com.socola.out.socolaSpringBoot.repository.General;

import com.socola.out.socolaSpringBoot.entity.General.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IInventarioDao extends JpaRepository <Inventario, Long> {
}
