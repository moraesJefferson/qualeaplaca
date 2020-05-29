package br.com.qualeaplaca.rest;

import br.com.qualeaplaca.dto.FotoDto;
import br.com.qualeaplaca.model.Foto;
import br.com.qualeaplaca.responses.Responses;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.Call;

public interface QualEaPlacaRestApiClient {

	@POST("/api/qualeaplaca/buscar")
	public Call<Responses<Foto>> buscarPlaca(
			@Body FotoDto fotoDto);
}
