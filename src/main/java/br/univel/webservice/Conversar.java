package br.univel.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(name = "Conversar")
@SOAPBinding(style = Style.RPC)
public interface Conversar {

	@WebMethod
	public String conversar();

}
