package br.com.acqiogrowup.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

@Entity
@Getter @Setter
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clienteId;
    private String nome;
    private String rg;
    private String cpf;
    private String telefone;
    private String email;

    @OneToOne
    @JoinColumn (name="enderecoId")
    @JsonIgnore
    private Endereco endereco;

   /* @OneToOne
    @JoinColumn (name="cartaoId")
    private Cartao cartao; */

    /*@OneToMany
    @JoinColumn (name="idPedido")
    private Pedido pedido;
*/

}