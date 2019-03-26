package com.vcs.lects.l06.arrays_cycles.tasks;

public class PersonConverter {
	
	
	public static void main(String[] args) {
		PersonConverter pc = new PersonConverter();
		
		 Person ona = pc.personFromString("Ona Onute 4485465456 1984 mot");
		 Person alg = pc.personFromString( "Algis Antanas Žigas 3485465456 1984 vyr");
		 
		 System.out.println(ona.getVardas());
		 System.out.println(ona.getPavarde());
		 System.out.println(ona.getGimMetai());
		 System.out.println(ona.getLytis());
		 
		 System.out.println();
		 
		 System.out.println(alg.getVardas());
		 System.out.println(alg.getPavarde());
		 System.out.println(alg.getGimMetai());
		 System.out.println(alg.getLytis());
		 
	}

	/**
	 * "Ona Onute 4485465456 1984 mot" -> Person
	 * 
	 * "Algis Antanas Žigas 3485465456 1984 vyr"

	 * 
	 */

	public Person personFromString(String strData) {
		
		String[] splited = strData.split(" ");
		int indexCount = 0;
		

		Person result = new Person();

		result.setId(null);
		result.setVardas(splited[indexCount++] + (splited.length == 6 ? "-" +  splited[indexCount++] : "" ));
		result.setPavarde(splited[indexCount++]);
		result.setAk(splited[indexCount++]);
		result.setGimMetai(Integer.parseInt(splited[indexCount++]));
		result.setLytis(Lytis.valueOf(splited[indexCount++].toUpperCase()));

		return result;
	}
	
	
	
	
	
	
}
