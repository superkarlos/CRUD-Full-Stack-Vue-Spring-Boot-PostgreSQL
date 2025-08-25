package br.com.backend.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.backend.project.model.PessoaEntity;
@Repository
public interface PessoaRepository extends JpaRepository<PessoaEntity,Long>{

    
} 