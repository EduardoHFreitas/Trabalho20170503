package br.univel.webservice;

import javax.jws.WebService;

@WebService(endpointInterface = "br.univel.webservice.Conversar")
public class ConversarImpl implements Conversar {

	@Override
	public String conversar() {
		return "Ola, tudo bem? Não tenho muito tempo, preciso sair :/";
	}
}
