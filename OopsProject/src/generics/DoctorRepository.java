package generics;

import classes.Doctor;

public class DoctorRepository {
	
	private Doctor doctors[];
	
	public DoctorRepository(Doctor doctors[]) {
		
		this.doctors = doctors;
		
	}
	
	public Doctor[] getDoctors() {
		return this.doctors;
	}
	
	public void addDoctor(int index,Doctor doctor) {
		this.doctors[index] = doctor;
	}

}
