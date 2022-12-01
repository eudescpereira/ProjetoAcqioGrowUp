package br.com.acqiogrowup.controlador;

import br.com.acqiogrowup.modelo.Pagamento;
import br.com.acqiogrowup.repositorio.PagamentoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pagamento")
public class PagamentoControlador {

    @Autowired
    PagamentoRepositorio pagamentoRepositorio;

    @GetMapping
    public List<Pagamento> listar(){
        return pagamentoRepositorio.findAll();
    }

    @PostMapping
    public Pagamento pagar (@RequestBody Pagamento pagamento){
        return pagamentoRepositorio.save(pagamento);
    }

}