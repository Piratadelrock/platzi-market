package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.Product;
import com.platzi.market.persistence.entity.Producto;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring",uses = {CategoryMapper.class})
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "idProducto",target="productId"),
            @Mapping(source = "idCategoria",target="categoryId"),
            @Mapping(source = "nombre",target="name"),
            @Mapping(source = "precioVenta",target="price"),
            @Mapping(source = "cantidadStock",target="stock"),
            @Mapping(source = "estado",target="active"),
            @Mapping(source = "categoria",target="category")
    })
    Product toProduct(Producto producto);
    //este hace la parte de los DTO COMO toProductDto()
    List<Product> toProducts(List<Producto> productos);

    @InheritInverseConfiguration
    @Mapping(target = "codigoBarras",ignore = true)
    Producto toProducto(Product product);
}
