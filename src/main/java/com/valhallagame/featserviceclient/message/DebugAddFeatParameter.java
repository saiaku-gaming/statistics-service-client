package com.valhallagame.featserviceclient.message;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DebugAddFeatParameter {
	@NotNull
	private String username;
	
	@NotNull
	private String itemName;
}
