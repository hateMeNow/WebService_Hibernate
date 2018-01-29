package com.service.operation;


import com.service.entity.Persona;
import com.service.utils.EntityManagerUtils;

public class PersonaPO {
	
	public static Persona insertPersona(Persona persona){

		if ( !EntityManagerUtils.isAttive())
			EntityManagerUtils.activeTransaction();

		EntityManagerUtils.getEntityManager().persist(persona);
		
		return persona;
		
	}
}
