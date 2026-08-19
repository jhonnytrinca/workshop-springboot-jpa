package com.testesjava.curso_jpa_spring.entities.pk;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.testesjava.curso_jpa_spring.entities.Order;
import com.testesjava.curso_jpa_spring.entities.Product;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Setter;

@Setter
@Embeddable
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class OrderItemPK {

    @ManyToOne
    @JoinColumn(name = "order_id")
    @EqualsAndHashCode.Include
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    @EqualsAndHashCode.Include
    private Product product;

    @JsonIgnore
    public Order getOrder() {
        return order;
    }

    @JsonIgnore
    public Product getProduct() {
        return product;
    }
}
