package krzysztof.springpaging.user.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import krzysztof.springpaging.BaseEntity;
import krzysztof.springpaging.company.domain.Company;
import krzysztof.springpaging.product.domain.Product;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

	@NotNull
	String email;

	String name;

	@ManyToMany
	Set<Product> products;

	@ManyToOne
	Company company;
}
