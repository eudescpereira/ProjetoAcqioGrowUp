package br.com.acqiogrowup.controlador;

import br.com.acqiogrowup.modelo.Cartao;
import br.com.acqiogrowup.repositorio.CartaoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cartao")
public class CartaoControlador {

    @Autowired
    CartaoRepositorio cartaoRepositorio;

    @PostMapping
    public Cartao pagar (@RequestBody Cartao cartao){
        return cartaoRepositorio.save(cartao);
    }

    @GetMapping
    public List<Cartao> listar(){
        return cartaoRepositorio.findAll();
    }

    @PutMapping("/{cartaoId}")
    public void atualizar (@RequestBody Cartao cartao){
        cartaoRepositorio.save(cartao);
    }

    @DeleteMapping("/{cartaoId}")
    public void apagar (@PathVariable Long cartaoId){
        cartaoRepositorio.deleteById(cartaoId);
    }
}