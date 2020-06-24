package br.com.qualeaplaca.rest;

import java.util.List;

import br.com.qualeaplaca.model.Foto;
import br.com.qualeaplaca.responses.Responses;
import retrofit2.Call;
import retrofit2.http.POST;

public interface QualEaPlacaRestApiClient {

	@POST("/api/qualeaplaca/buscar")
	public Call<Responses<List<Foto>>> buscarPlaca();
}
