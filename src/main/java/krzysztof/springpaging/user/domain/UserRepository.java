package krzysztof.springpaging.user.domain;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository
		extends
			PagingAndSortingRepository<User, Long>,
			JpaSpecificationExecutor<User> {

}
