package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

	private List<Doctor> doctors = new ArrayList<Doctor>();
	private List<Patient> patients = new ArrayList<Patient>();

	public void assignPatientsToDoctors() {
		int cD = 0;
		for (int i = 0; i < patients.size(); i++) {
			if (doctors.get(cD).isFull() == false) {
				try {
					doctors.get(cD).assignPatient(patients.get(i));
				} catch (DoctorFullException e) {
					e.printStackTrace();
				}
			} else {
				cD++;
				i--;
			}
		}
	}

	public void addDoctor(Doctor d) {
		doctors.add(d);
	}

	public void addPatient(Patient p) {
		patients.add(p);
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> d) {
		doctors = d;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> p) {
		patients = p;
	}
}
