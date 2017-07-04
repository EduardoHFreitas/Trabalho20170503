package br.univel.cdi.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.univel.beans.Despedir;

@Named
@RequestScoped
@Despedir
public class FinalizarConversa implements PessoaDao{

	@Override
	public String conversar() {
		return "Preciso ir. Adeus!";
	}
}
