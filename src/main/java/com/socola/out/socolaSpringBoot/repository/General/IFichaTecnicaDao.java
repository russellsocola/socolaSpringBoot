package com.socola.out.socolaSpringBoot.repository.General;

import com.socola.out.socolaSpringBoot.entity.General.FichaTecnica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFichaTecnicaDao extends JpaRepository <FichaTecnica, Long> {
}
