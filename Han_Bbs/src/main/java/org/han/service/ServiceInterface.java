package org.han.service;

import org.springframework.ui.Model;

public interface ServiceInterface {

	
	//Create, Read, Update, Delete
	
	public void create(Model vo);
	
	public Model read(Model k);
	
	public void update(Model s, Model vo);
	
	public void delete(Model k);
	
}
