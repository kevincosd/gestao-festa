package br.gov.sp.etec.gestaofesta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.sp.etec.gestaofesta.model.Convidado;

@Repository 
public interface ConvidadoRepository extends JpaRepository<Convidado, Long>{

}
