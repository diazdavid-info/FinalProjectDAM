/**
 * Clase que transforma la entidad School
 * @author David Diaz Garcia
 * @date 09-05-2015
 */
package david.model.transformer;

import david.model.persistence.SchoolPersistence;
import david.model.pojo.builder.SchoolBuilder;
import david.model.pojo.school.School;

public class SchoolTransformer implements ISchoolTransformer{
	
	/**
	 * Método que transforma la entidad School en la persistencia School
	 * @param School school
	 * @return SchoolPersistence 
	 */
	public SchoolPersistence entityToPersistence(School school){
		SchoolPersistence schoolPersistence = new SchoolPersistence();
		schoolPersistence.setCodeIdentification(school.getCodeIdentification());
		
		if(school.getId() != 0){
			schoolPersistence.setId(school.getId());
		}
		
		if(school.getAddress() != null){
			schoolPersistence.setIdAddress(school.getAddress().getId());
		}
		
		schoolPersistence.setName(school.getName());
		return schoolPersistence;
	}
	
	/**
	 * Método que transforma la persistencia de School en la entidad School
	 * @param SchoolPersistence schoolPersistence
	 * @return School
	 */
	public School persistenceToEntity(SchoolPersistence schoolPersistence){
		SchoolBuilder schoolBuilder = new SchoolBuilder();
		schoolBuilder
		.codeIdentification(schoolPersistence.getCodeIdentification())
		.id(schoolPersistence.getId())
		.name(schoolPersistence.getName());
		return new School(schoolBuilder);
	}

}
