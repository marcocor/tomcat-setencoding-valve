package it.unipi.di.acube.encodingValve;

import javax.servlet.ServletException;
import java.io.IOException;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.apache.catalina.valves.ValveBase;

public class SetCharEncodingValve extends ValveBase {

	private String encoding = "utf-8";

	@Override
	public void invoke(Request request, Response response) throws IOException, ServletException {
		request.setCharacterEncoding(encoding);
		getNext().invoke(request, response);
	}

	public void setEncoding(String encoding) {
		if (encoding != null)
			this.encoding = encoding;
	}

	public String getEncoding() {
		return this.encoding;
	}

}
