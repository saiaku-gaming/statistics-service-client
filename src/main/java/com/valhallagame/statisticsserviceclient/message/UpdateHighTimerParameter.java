package com.valhallagame.statisticsserviceclient.message;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.valhallagame.common.validation.CheckLowercase;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateHighTimerParameter {
	@NotBlank
	@CheckLowercase
	private String characterName;

	@NotNull
	private StatisticsKey key;

	@NotNull
	private float timer;
}
