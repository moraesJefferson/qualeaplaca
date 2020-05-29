package br.com.qualeaplaca.client;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class ApiService {

	public ApiService() {}
	
	protected static Retrofit getRetrofitClientJSON(String url) {
		return getRetrofitClient(url,"application/json");
	}
	
	protected static Retrofit getRetrofitClient(String url, final String contentType) {
		OkHttpClient cliente = new OkHttpClient.Builder().connectTimeout(30, TimeUnit.SECONDS)
				.writeTimeout(30, TimeUnit.SECONDS)
				.readTimeout(30, TimeUnit.SECONDS)
				.addInterceptor(new Interceptor(){
					@Override
					public Response intercept(Chain chain) throws IOException {
						return chain.proceed(chain.request()
								.newBuilder()
								.addHeader("Content-Type", contentType)
								.build());
					}})
				.build();
		
		ObjectMapper mapper = new ObjectMapper()
				.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl(url)
				.client(cliente)
				.addConverterFactory(JacksonConverterFactory.create(mapper))
				.build();
		
		return retrofit;
	}
}
