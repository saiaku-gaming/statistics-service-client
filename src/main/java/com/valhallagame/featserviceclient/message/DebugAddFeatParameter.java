package com.valhallagame.statisticsserviceclient.message;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DebugAddStatisticsParameter {
	@NotNull
	private String username;
	
	@NotNull
	private String itemName;
}
