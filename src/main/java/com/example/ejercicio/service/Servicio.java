package com.example.ejercicio.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.Endpoint;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name="Servicio",targetNamespace = "utez")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class Servicio {
    @WebMethod(operationName ="devuelveMensaje")
    public String devuelveMensaje(@WebParam String valor){
        return "Holaaa"+valor;
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:7777/Servicio",new Servicio());
    }
}
