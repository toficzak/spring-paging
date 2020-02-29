package krzysztof.springpaging.user.api;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import krzysztof.springpaging.user.domain.User;
import krzysztof.springpaging.user.domain.UserMapper;
import krzysztof.springpaging.user.domain.UserRepository;

@RestController
@RequestMapping("users")
public class UserRestController {

	private UserRepository userRepository;

	public UserRestController(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@GetMapping
	public List<UserDto> listing(
			@RequestParam("page") Optional<Integer> optPage,
			@RequestParam("size") Optional<Integer> optSize) {

		Iterable<User> users;
		if (optPage.isPresent() && optSize.isPresent()) {
			Pageable pageable = PageRequest.of(optPage.get(), optSize.get(),
					Sort.by("id"));
			users = userRepository.findAll(pageable);
		} else {
			users = userRepository.findAll();
		}

		Set<User> uniqueUsers = new HashSet<User>();
		users.forEach(uniqueUsers::add);
		return UserMapper.toDto(uniqueUsers);
	}
}
