package com.socola.out.socolaSpringBoot.repository.General;

import com.socola.out.socolaSpringBoot.entity.General.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoDao extends JpaRepository <Producto, Long> {
}
