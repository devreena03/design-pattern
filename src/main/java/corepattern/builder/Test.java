package corepattern.builder;

import corepattern.builder.HttpClient.HttpClientBuilder;

public class Test {
	public static void main(String[] args) {
//		HttpClient httpClient = new HttpClient("GET","http://test.com","user","123","json","{}");
//		
//		HttpClient httpClient1 = new HttpClient("GET","http://test.com",null,null,null,"{}");//no idea for user what null means
		
		HttpClientBuilder builder = new HttpClient.HttpClientBuilder();
		
		HttpClient build = builder.method("POST").url("testURL").body("{}").build();
		
		System.out.println(build);
		
	}
}
