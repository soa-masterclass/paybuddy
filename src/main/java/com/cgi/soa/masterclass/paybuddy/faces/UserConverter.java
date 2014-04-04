package com.cgi.soa.masterclass.paybuddy.faces;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import com.cgi.soa.masterclass.paybuddy.model.UserEntity;
import com.cgi.soa.masterclass.paybuddy.service.PersistentDAOLocal;

@FacesConverter("UserIdConverter")
public class UserConverter implements Converter{
	
	@Inject
	private PersistentDAOLocal manager;
	
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {		
		return manager.getUser(Integer.parseInt(arg2));
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {		
		UserEntity user= (UserEntity)arg2;		
		return manager.getUser(user.getId()).toString();
	}

}
