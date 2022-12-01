package br.com.acqiogrowup.repositorio;

import br.com.acqiogrowup.modelo.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepositorio extends JpaRepository <Pagamento, Long> {
}