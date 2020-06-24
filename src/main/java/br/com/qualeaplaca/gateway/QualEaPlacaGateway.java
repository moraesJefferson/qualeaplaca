package br.com.qualeaplaca.gateway;

import java.util.ArrayList;
import java.util.List;

import br.com.qualeaplaca.client.QualEaPlacaRestApiServiceImpl;
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

	public List<Foto> buscaPlaca() {
		
		List<Foto> listaFotos = new ArrayList<Foto>();
		
		QualEaPlacaRestApiServiceImpl service = newInstanceQualEaPlacaService();		
		listaFotos = service.buscaPlaca();
			
		return listaFotos;
	}
	
	private QualEaPlacaRestApiServiceImpl newInstanceQualEaPlacaService() {
		return QualEaPlacaRestApiServiceImpl.newInstance(ENDPOINT_API.toString());
	}

}
