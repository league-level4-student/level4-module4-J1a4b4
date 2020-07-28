package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {

	private boolean performsSurgery;
	private boolean makesHouseCalls;
	
	private List<Patient> patients = new ArrayList<Patient>();

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

	public void assignPatient(Patient patient) {
		patients.add(patient);
	}
}
