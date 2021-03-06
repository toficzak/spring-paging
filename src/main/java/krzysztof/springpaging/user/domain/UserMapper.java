package krzysztof.springpaging.user.domain;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import krzysztof.springpaging.company.domain.CompanyMapper;
import krzysztof.springpaging.user.api.UserDto;

public class UserMapper {

	public static List<UserDto> toDto(Set<User> users) {
		return users.stream().map(UserMapper::toDto)
				.sorted(Comparator.comparingLong(dto -> dto.id))
				.collect(Collectors.toList());
	}

	private static UserDto toDto(User user) {
		UserDto dto = new UserDto();
		dto.id = user.getId();
		dto.email = user.email;
		dto.name = user.name;
		Optional.ofNullable(user.company).ifPresent(
				company -> dto.companyName = CompanyMapper.toDto(company).name);
		return dto;
	}

}
