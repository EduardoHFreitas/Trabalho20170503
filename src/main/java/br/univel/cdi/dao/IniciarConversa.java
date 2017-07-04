package br.univel.cdi.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.univel.beans.Comprimentar;

@Named
@RequestScoped
@Comprimentar
public class IniciarConversa implements PessoaDao{

	@Override
	public String conversar() {
		return "Olá, tudo bem?";
	}

}
