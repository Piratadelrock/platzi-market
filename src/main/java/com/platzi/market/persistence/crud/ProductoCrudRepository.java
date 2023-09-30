package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

//    @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
//    List<Producto> findByIdCategoria(int idCategoria);
    //se usa query method  -> findBy, OrderBy, Asc son palabras clave,
    // si tenemos nuestro @Query, no necesitamos nombrarlos asi,
    // pero si es mejor practica hacerlo con jpa,querymethods para tener mas flexibilidad

    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

    Optional<List<Producto>> findByPrecioVentaLessThanAndIdCategoriaOrderByNombreAsc(double precioVenta, int idCategoria);
    Optional<List<Producto>> findByCodigoBarrasAscAndEstado(String codigoBarras, boolean estado);
    Optional<List<Producto>> findByPrecioVentaGreaterThanEqualAndCantidadStockLessThanOrderByNombre(double precioVenta, int cantidadStock);

    Optional<List<Producto>> findByNombreAndPrecioVentaGreaterThanAndEstado(String nombre,double precioVenta,boolean estado);

}
