package com.emnify.tapfilereport;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.rest.RestStatus;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

public class Main {

	public static void main(String[] args) throws UnknownHostException {

		// Settings settings = Settings.builder().put("cluster.name",
		// "myClusterName").build();
		// TransportClient client = new PreBuiltTransportClient(settings);

		// TransportClient client = new
		// PreBuiltTransportClient(Settings.EMPTY).addTransportAddress(new
		// InetSocketTransportAddress(InetAddress.getByName("http://54.154.205.82"),
		// 90));

		TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)
				.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("localhost"), 9300));

		String json = "{" + "\"user\":\"kimchy\"," + "\"postDate\":\"2013-01-30\","
				+ "\"message\":\"trying out Elasticsearch\"" + "}";

		IndexResponse response = client.prepareIndex("twitter", "tweet").setSource(json).get();

		// Index name
		String _index = response.getIndex();
		System.out.println(_index);

		// Type name
		String _type = response.getType();
		System.out.println(_type);

		// Document ID (generated or not)
		String _id = response.getId();
		System.out.println(_id);

		// Version (if it's the first time you index this document, you will
		// get: 1)
		long _version = response.getVersion();
		System.out.println(_version);

		// status has stored current instance statement.
		RestStatus status = response.status();
		System.out.println(status);

		System.out.println("\n\n------------------------------------------------------------------\n\n");

		GetResponse responseGet = client.prepareGet("twitter", "tweet", "1").get();
		// Index name
		_index = responseGet.getIndex();
		System.out.println(_index);

		// Type name
		_type = responseGet.getType();
		System.out.println(_type);

		// Document ID (generated or not)
		_id = responseGet.getId();
		System.out.println(_id);

		// Version (if it's the first time you index this document, you will
		// get: 1)
		_version = responseGet.getVersion();
		System.out.println(_version);



		client.close();
	}
}
