package br.com.acqiogrowup.repositorio;

import br.com.acqiogrowup.modelo.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepositorio extends JpaRepository<Endereco, Long> {


}



