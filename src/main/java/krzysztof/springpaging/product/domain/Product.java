package krzysztof.springpaging.product.domain;

import javax.persistence.Entity;

import krzysztof.springpaging.BaseEntity;

@Entity
public class Product extends BaseEntity {

	String code;
	String name;

}
