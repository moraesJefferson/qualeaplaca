package br.com.qualeaplaca.gateway;

import br.com.qualeaplaca.client.QualEaPlacaRestApiServiceImpl;
import br.com.qualeaplaca.dto.FotoDto;
import br.com.qualeaplaca.model.Foto;

public class QualEaPlacaGateway {
	
	private static QualEaPlacaGateway instance = null;
	
	private static String ENDPOINT_API = null;
	
	private QualEaPlacaGateway() {
		
		ENDPOINT_API = "http://localhost:8089";
	}
	
	public static QualEaPlacaGateway newInstance() {
		if(instance == null) {
			instance = new QualEaPlacaGateway();
		}
		return instance;
	}

	public Foto buscaPlaca(FotoDto fotoDto) {
		
		Foto foto = new Foto();
		
		if(fotoDto != null) {
			QualEaPlacaRestApiServiceImpl service = newInstanceQualEaPlacaService();		
			foto = service.buscaPlaca(fotoDto);
		}	
		return foto;
	}
	
	private QualEaPlacaRestApiServiceImpl newInstanceQualEaPlacaService() {
		return QualEaPlacaRestApiServiceImpl.newInstance(ENDPOINT_API.toString());
	}

}
