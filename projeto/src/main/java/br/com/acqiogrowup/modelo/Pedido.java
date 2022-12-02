package br.com.acqiogrowup.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Pedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pedidoId;
    private Double valorTotal;

    @OneToMany
    @JoinColumn (name="idProduto")
    @JsonIgnore
    private List<Produto> listaProdutos;

    @OneToOne
    @JoinColumn (name="idEndereco")
    @JsonIgnore
    private Endereco endereco;

    @OneToOne
    @JoinColumn (name="idPagamento")
    private Pagamento pagamento;

}