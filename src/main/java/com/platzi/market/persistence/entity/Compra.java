package com.platzi.market.persistence.entity;

import javax.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;


@Data
@Entity
@Table(name ="compras")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_compra")
    private Integer idCompra;

    @Column(name="id_cliente")
    private String idCliente;

    private LocalDateTime fecha;

    @Column(name="medio_pago")
    private Integer medioPago;

    private Integer comentario;
    private Integer estado;

    @ManyToOne
    @JoinColumn(name = "id_cliente", insertable = false, updatable = false)
    private Cliente cliente;

    @OneToMany(mappedBy="compra")
    private List<ComprasProducto> productos;


}
