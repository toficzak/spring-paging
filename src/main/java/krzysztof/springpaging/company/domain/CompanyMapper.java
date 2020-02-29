package krzysztof.springpaging.company.domain;

import krzysztof.springpaging.company.api.CompanyDto;

public class CompanyMapper {

	public static CompanyDto toDto(Company company) {
		CompanyDto dto = new CompanyDto();
		dto.name = company.name;
		return dto;
	}

}
