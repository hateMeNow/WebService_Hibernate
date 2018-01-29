package com.service.operation;

import com.service.entity.Ruolo;
import com.service.utils.EntityManagerUtils;

public class RuoloPO {

	public static Ruolo insertRuolo(Ruolo ruolo){
		
		if ( !EntityManagerUtils.isAttive())
			EntityManagerUtils.activeTransaction();
		
		EntityManagerUtils.getEntityManager().persist(ruolo);

		return ruolo;
	}
}
