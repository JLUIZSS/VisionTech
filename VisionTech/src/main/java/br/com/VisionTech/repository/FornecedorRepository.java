package br.com.VisionTech.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.VisionTech.model.FornecedorModel;

@Repository
public interface FornecedorRepository extends JpaRepository<FornecedorModel, Long>{

}
