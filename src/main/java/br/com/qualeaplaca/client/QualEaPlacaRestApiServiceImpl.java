package br.com.qualeaplaca.client;

import br.com.qualeaplaca.dto.FotoDto;
import br.com.qualeaplaca.model.Foto;
import br.com.qualeaplaca.rest.QualEaPlacaRestApiClient;
import br.com.qualeaplaca.responses.*;
import retrofit2.Call;
import retrofit2.Response;

public class QualEaPlacaRestApiServiceImpl extends ApiService{
	private static QualEaPlacaRestApiServiceImpl instance = null;
	private static QualEaPlacaRestApiClient client = null;
	
	
	public static QualEaPlacaRestApiServiceImpl newInstance(String url) {
		if(instance == null) {
			instance = new QualEaPlacaRestApiServiceImpl(url);
		}
		return instance;
	}
	
	private QualEaPlacaRestApiServiceImpl(String url) {
		client = getRetrofitClientJSON(url).create(QualEaPlacaRestApiClient.class);		
	}
	
	public Foto buscaPlaca(FotoDto fotoDto) {
		Call<Responses<Foto>> serviceClient = client.buscarPlaca(fotoDto);
		Response<br.com.qualeaplaca.responses.Responses<Foto>> foto = null;
		try {
			foto = serviceClient.execute();
			if(foto.code() !=200) {
				System.out.println("Error! "+foto.code());
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return foto.body().getData();
	}

}
