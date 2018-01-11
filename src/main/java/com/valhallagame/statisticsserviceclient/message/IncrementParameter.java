package com.valhallagame.statisticsserviceclient.message;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IncrementParameter {
	@NotNull
	private String characterName;
	
	@NotNull
	private String key;
	
	@NotNull
	private int value;
}
