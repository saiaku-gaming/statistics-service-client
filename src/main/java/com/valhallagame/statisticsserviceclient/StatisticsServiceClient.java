package com.valhallagame.statisticsserviceclient;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.valhallagame.common.DefaultServicePortMappings;
import com.valhallagame.common.RestCaller;
import com.valhallagame.common.RestResponse;
import com.valhallagame.statisticsserviceclient.message.AddStatisticsParameter;
import com.valhallagame.statisticsserviceclient.message.DebugAddStatisticsParameter;
import com.valhallagame.statisticsserviceclient.message.GetStatisticssParameter;


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

	public RestResponse<List<String>> getStatisticss(String characterName) throws IOException {
		return restCaller.postCall(statisticsServiceServerUrl + "/v1/statistics/get-statisticss",
				new GetStatisticssParameter(characterName), new TypeReference<List<String>>() {});
	}

	public RestResponse<String> addStatistics(String characterName, String statistics) throws IOException {
		return restCaller.postCall(statisticsServiceServerUrl + "/v1/statistics/add-statistics",
				new AddStatisticsParameter(characterName, statistics), String.class);
	}

	public RestResponse<String> debugAddStatistics(String username, String statistics) throws IOException {
		return restCaller.postCall(statisticsServiceServerUrl + "/v1/statistics/debug-add-statistics",
				new DebugAddStatisticsParameter(username, statistics), String.class);
	}
}
