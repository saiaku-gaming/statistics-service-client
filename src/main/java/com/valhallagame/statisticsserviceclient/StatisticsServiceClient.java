package com.valhallagame.statisticsserviceclient;

import com.valhallagame.common.AbstractServiceClient;
import com.valhallagame.common.DefaultServicePortMappings;
import com.valhallagame.common.RestResponse;
import com.valhallagame.statisticsserviceclient.message.IncrementIntCounterParameter;
import com.valhallagame.statisticsserviceclient.message.StatisticsKey;
import com.valhallagame.statisticsserviceclient.message.UpdateHighTimerParameter;
import com.valhallagame.statisticsserviceclient.message.UpdateLowTimerParameter;

import java.io.IOException;

public class StatisticsServiceClient extends AbstractServiceClient {
	private static StatisticsServiceClient statisticsServiceClient;

	private StatisticsServiceClient() {
		serviceServerUrl = "http://localhost:" + DefaultServicePortMappings.STATISTICS_SERVICE_PORT;
	}

	public static void init(String serviceServerUrl) {
		StatisticsServiceClient client = get();
		client.serviceServerUrl = serviceServerUrl;
	}

	public static StatisticsServiceClient get() {
		if (statisticsServiceClient == null) {
			statisticsServiceClient = new StatisticsServiceClient();
		}
		return statisticsServiceClient;
	}

	public RestResponse<String> incrementIntCounter(String characterName, StatisticsKey key, int value)
			throws IOException {
		return restCaller.postCall(serviceServerUrl + "/v1/statistics/increment-int-counter",
				new IncrementIntCounterParameter(characterName, key, value), String.class);
	}

	public RestResponse<String> updateLowTimer(String characterName, StatisticsKey key, float timer)
			throws IOException {
		return restCaller.postCall(serviceServerUrl + "/v1/statistics/update-low-timer",
				new UpdateLowTimerParameter(characterName, key, timer), String.class);
	}

	public RestResponse<String> updateHighTimer(String characterName, StatisticsKey key, float timer)
			throws IOException {
		return restCaller.postCall(serviceServerUrl + "/v1/statistics/update-high-timer",
				new UpdateHighTimerParameter(characterName, key, timer), String.class);
	}
}
