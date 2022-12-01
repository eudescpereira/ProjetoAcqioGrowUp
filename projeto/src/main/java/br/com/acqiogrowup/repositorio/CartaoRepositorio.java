package br.com.acqiogrowup.repositorio;

import br.com.acqiogrowup.modelo.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartaoRepositorio extends JpaRepository<Cartao, Long> {
}