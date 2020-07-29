package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {

	private boolean performsSurgery;
	private boolean makesHouseCalls;
	private boolean isFull;
	
	private List<Patient> patients;

	public Doctor() {
		isFull = false;
		patients = new ArrayList<Patient>();
	}
	
	public boolean performsSurgery() {
		return performsSurgery;
	}

	public void setPerformsSurgery(boolean performsSurgery) {
		this.performsSurgery = performsSurgery;
	}

	public boolean makesHouseCalls() {
		return makesHouseCalls;
	}

	public void setMakesHouseCalls(boolean makesHouseCalls) {
		this.makesHouseCalls = makesHouseCalls;
	}

	public List<Patient> getPatients() {
		return patients;
	}
	
	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	public void doMedicine() {
		for (Patient patient : patients) {
			patient.setFeelsCaredFor(true);
		}
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		if (getPatients().size() == 3) {
			throw new DoctorFullException();
		}else {
			patients.add(patient);
			if (getPatients().size() == 3) {
				setFull(true);
			}
		}
	}

	public boolean isFull() {
		return isFull;
	}

	public void setFull(boolean isFull) {
		this.isFull = isFull;
	}
}
