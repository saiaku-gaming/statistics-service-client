package com.valhallagame.featserviceclient;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.valhallagame.common.DefaultServicePortMappings;
import com.valhallagame.common.RestCaller;
import com.valhallagame.common.RestResponse;
import com.valhallagame.featserviceclient.message.AddFeatParameter;
import com.valhallagame.featserviceclient.message.DebugAddFeatParameter;
import com.valhallagame.featserviceclient.message.GetFeatsParameter;


public class FeatServiceClient {
	private static FeatServiceClient featServiceClient;

	private String featServiceServerUrl = "http://localhost:" + DefaultServicePortMappings.FEAT_SERVICE_PORT;
	private RestCaller restCaller;

	private FeatServiceClient() {
		restCaller = new RestCaller();
	}

	public static void init(String featServiceServerUrl) {
		FeatServiceClient client = get();
		client.featServiceServerUrl = featServiceServerUrl;
	}

	public static FeatServiceClient get() {
		if (featServiceClient == null) {
			featServiceClient = new FeatServiceClient();
		}

		return featServiceClient;
	}

	public RestResponse<List<String>> getFeats(String characterName) throws IOException {
		return restCaller.postCall(featServiceServerUrl + "/v1/feat/get-feats",
				new GetFeatsParameter(characterName), new TypeReference<List<String>>() {});
	}

	public RestResponse<String> addFeat(String characterName, String feat) throws IOException {
		return restCaller.postCall(featServiceServerUrl + "/v1/feat/add-feat",
				new AddFeatParameter(characterName, feat), String.class);
	}

	public RestResponse<String> debugAddFeat(String username, String feat) throws IOException {
		return restCaller.postCall(featServiceServerUrl + "/v1/feat/debug-add-feat",
				new DebugAddFeatParameter(username, feat), String.class);
	}
}
