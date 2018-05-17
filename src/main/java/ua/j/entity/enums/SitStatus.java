package ua.j.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SitStatus {

	ROLE_FREE("FREE"), ROLE_SOLD("SOLD");
	
	private String status;
	
}
