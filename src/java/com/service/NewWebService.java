/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author MSI
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "Sayhello")
    public String Sayhello(@WebParam(name = "name") String name) {
        return "Hello " + name + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Say hello")
    public String operation(@WebParam(name = "name") String name) {
        //TODO write your implementation code here:
        return " Hello" + name +"!";
    }
}
