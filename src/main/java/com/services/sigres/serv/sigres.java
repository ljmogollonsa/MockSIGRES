package com.services.sigres.serv;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.services.sigres.model.ModelResponse;
import com.services.sigres.model.SIGRESModelRequest;

@RestController
@RequestMapping(path = "/Services")
public class sigres {

	@RequestMapping(method = RequestMethod.POST, 
            consumes = "application/json", produces = "application/json", 
            path = "/sigres")
    public @ResponseBody String postUsuario(@RequestBody SIGRESModelRequest request) {
        ModelResponse respuesta = new ModelResponse();
		if (SIGRESModelRequest.class != null) {
			ModelResponse.setStatus("{\"ACK\":\"Accept\"}");
		}
		return "{\"ACK\":\"Accept\"}";
	}
}
