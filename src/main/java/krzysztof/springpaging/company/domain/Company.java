package krzysztof.springpaging.company.domain;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import krzysztof.springpaging.BaseEntity;

@Entity
public class Company extends BaseEntity {

	@NotNull
	String name;
}
