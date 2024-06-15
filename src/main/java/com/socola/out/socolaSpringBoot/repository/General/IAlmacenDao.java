package com.socola.out.socolaSpringBoot.repository.General;

import com.socola.out.socolaSpringBoot.entity.General.Almacen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IAlmacenDao extends JpaRepository <Almacen, Long> {
}
