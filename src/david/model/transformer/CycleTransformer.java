/**
 * Clase que transforma la entidad Cycle
 * @author David Diaz Garcia
 * @date 10-05-2015
 */
package david.model.transformer;

import david.model.persistence.CyclePersistence;
import david.model.pojo.builder.CycleBuilder;
import david.model.pojo.school.Cycle;

public class CycleTransformer implements ICycleTransformer {

	/**
	 * Método que transforma la entidad Cycle en la persistencia Cycle
	 * 
	 * @param Cycle
	 *            cycle
	 * @return CyclePersistence
	 */
	@Override
	public CyclePersistence entityToPersistence(Cycle cycle) {
		CyclePersistence persistence = new CyclePersistence();

		if (cycle.getId() != 0) {
			persistence.setId(cycle.getId());
		}

		if (cycle.getCourse() != null) {
			persistence.setIdCourse(cycle.getCourse().getId());
		}

		if (cycle.getSchool() != null) {
			persistence.setIdSchool(cycle.getSchool().getId());
		}

		if (cycle.getTutor() != null) {
			persistence.setTutor(cycle.getTutor().getId());
		}

		persistence.setCodeIdentification(cycle.getIdentification());
		persistence.setName(cycle.getName());

		return persistence;
	}

	/**
	 * Método que transforma la persistencia de Cycle en la entidad Cycle
	 * 
	 * @param CyclePersistence
	 *            cyclePersistence
	 * @return Cycle
	 */
	@Override
	public Cycle persistenceToEntity(CyclePersistence cyclePersistence) {
		CycleBuilder cycleBuilder = new CycleBuilder();
		cycleBuilder.id(cyclePersistence.getId()).identification(cyclePersistence.getCodeIdentification()).name(cyclePersistence.getName());
		return new Cycle(cycleBuilder);
	}
}
