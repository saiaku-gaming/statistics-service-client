package com.valhallagame.featserviceclient.message;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddFeatParameter {
	@NotNull
	private String characterName;
	
	@NotNull
	private String featName;
}
