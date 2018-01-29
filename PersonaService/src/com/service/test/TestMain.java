package com.service.test;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

import com.service.entity.Luogo;
import com.service.entity.Persona;
import com.service.entity.Ruolo;
import com.service.operation.PersonaPO;
import com.service.operation.RuoloPO;
import com.service.utils.EntityManagerUtils;

public class TestMain {
	
    public static void main(String[] args) {
 
//    	Persona primaPersona = new Persona(12, "Manuel" , "Ciofo", "Manuel");
//    	
//    	Persona secondaPersona = new Persona(14, "Luciano" , "Ciofo", "Luciano");
//  	
//    	Persona terzaPersona = new Persona(19, "Alessio" , "Ciofo", "Alessio");
    	
    	Ruolo primoRuolo = new Ruolo(0, "NON_ATTIVO", 1);
    	
    	
    	Ruolo secondoRuolo = new Ruolo(17, "PRIMO", 0);
//    	
    	EntityManagerUtils.activeTransaction();
    	
    	if ( !EntityManagerUtils.isAttive()){
    		System.out.println(" transaction not active");
    	}else{
    		System.out.println(" transaction active");
  
//    		PersonaPO.insertPersona(primaPersona);
//    		
//    		PersonaPO.insertPersona(secondaPersona);
//    		
//    		PersonaPO.insertPersona(terzaPersona);
//
//    		RuoloPO.insertRuolo(primoRuolo);
//    		
//    		EntityManagerUtils.rollbackTransaction();
    		
    		try{
    			
    			EntityManagerUtils.activeTransaction();
    			
    			
    			
    			Luogo luogo = new Luogo();
    			
    			luogo.setId(1);
    			luogo.setDescrizione("Descrizione_Test");
    			luogo.setDate(Calendar.getInstance().getTime());
    			primoRuolo.setLuogo(luogo);
    			
    			RuoloPO.insertRuolo(primoRuolo);
    			
    			RuoloPO.insertRuolo(secondoRuolo);
    			
    			EntityManagerUtils.transactionCommit();
    			
    		}catch(PersistenceException pe){
    			pe.printStackTrace();
    			EntityManagerUtils.rollbackTransaction();
    		}
    		

    		
    	}
    	
    	
    	
//    	PersonaPO.insertPersona(secondaPersona);
//    	
//    	PersonaPO.insertPersona(terzaPersona);
//    	
//    	RuoloPO.insertRuolo(primoRuolo);
//    	
//    	RuoloPO.insertRuolo(secondoRuolo);
    }


    

}