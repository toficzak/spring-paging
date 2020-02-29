package krzysztof.springpaging.user.api;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public List<UserDto> listing() {
		Set<User> users = new HashSet<User>();
		userRepository.findAll().forEach(users::add);
		return UserMapper.toDto(users);
	}
}
