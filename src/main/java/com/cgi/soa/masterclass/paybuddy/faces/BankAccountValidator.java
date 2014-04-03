package com.cgi.soa.masterclass.paybuddy.faces;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;

import com.cgi.soa.masterclass.paybuddy.service.BankWS;

@FacesValidator("bankAccountValidator")
public class BankAccountValidator implements Validator {
	
	@Inject
	private BankWS service;

	@Override
	public void validate(FacesContext arg0, UIComponent arg1, Object accountNumber)
			throws ValidatorException {
		
		  if (accountNumber == null) {
	            FacesMessage msg = new FacesMessage("The Account number is empty!", "Account Number Validation Error");
	            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
	            throw new ValidatorException(msg);
	        }
		  
		  int accountNo= (Integer)accountNumber; // an error can occour when its a string/Man should check first whether its an integer
		  if(!service.getWebServices().isAccountExist(accountNo)){
			  FacesMessage msg = new FacesMessage("The Account number is not valid/Existing!", "Account Number Validation Error");
	            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
	            throw new ValidatorException(msg);
			  
		  }
		  
		  
		  
		  
		
		
		
	}

}
