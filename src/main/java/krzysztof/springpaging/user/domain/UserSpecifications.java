package krzysztof.springpaging.user.domain;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import krzysztof.springpaging.company.domain.Company;

public class UserSpecifications {

	public static Specification<User> userOfCompanyNameLike(
			String companyNameQuery) {
		return new Specification<User>() {

			private static final long serialVersionUID = 1L;

			@Override
			public Predicate toPredicate(Root<User> root,
					CriteriaQuery<?> query, CriteriaBuilder cb) {
				String expression = new StringBuilder("%")
						.append(companyNameQuery).append("%").toString();

				Join<User, Company> company = root.join("company");
				return cb.like(company.get("name"), expression);
			}
		};
	}
}
