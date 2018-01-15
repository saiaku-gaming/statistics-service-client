package com.valhallagame.statisticsserviceclient;

import java.io.IOException;

import com.valhallagame.common.DefaultServicePortMappings;
import com.valhallagame.common.RestCaller;
import com.valhallagame.common.RestResponse;
import com.valhallagame.statisticsserviceclient.message.IncrementIntCounterParameter;
import com.valhallagame.statisticsserviceclient.message.StatisticsKey;


public class StatisticsServiceClient {
	private static StatisticsServiceClient statisticsServiceClient;

	private String statisticsServiceServerUrl = "http://localhost:" + DefaultServicePortMappings.STATISTICS_SERVICE_PORT;
	private RestCaller restCaller;

	private StatisticsServiceClient() {
		restCaller = new RestCaller();
	}

	public static void init(String statisticsServiceServerUrl) {
		StatisticsServiceClient client = get();
		client.statisticsServiceServerUrl = statisticsServiceServerUrl;
	}

	public static StatisticsServiceClient get() {
		if (statisticsServiceClient == null) {
			statisticsServiceClient = new StatisticsServiceClient();
		}

		return statisticsServiceClient;
	}

	public RestResponse<String> incrementIntCounter(String characterName, StatisticsKey key, int value) throws IOException {
		return restCaller.postCall(statisticsServiceServerUrl + "/v1/statistics/increment-int-counter",
				new IncrementIntCounterParameter(characterName, key, value), String.class);
	}
}
