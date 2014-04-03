package com.cgi.soa.masterclass.paybuddy.service;

import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;

import com.cgi.soa.masterclass.paybuddy.sampleBank.ws.BankWeb;
import com.cgi.soa.masterclass.paybuddy.sampleBank.ws.BankWebService;

/**
 * Session Bean implementation class BankWS
 */
@Stateless
public class BankWS {

    /**
     * Default constructor. 
     */
	@WebServiceRef
	BankWebService service;
	
	
    public BankWS() {
    }
    
    public BankWeb getWebServices(){
    	return service.getBankWebPort();
    }

}
