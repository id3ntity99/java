package test6.sub06;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
  private String name;
  private String id;
  private String special;
  private List<Patient> patients;

  public Doctor(String name, String id, String special) {
    this.name = name;
    this.id = id;
    this.special = special;
    this.patients = new ArrayList<>();
  }

  public void addPatient(Patient patient) {
    this.patients.add(patient);
  }

  @Override
  public String toString() {
    String doctorInfo = String.format("%s(ID: %s, 전문분야: %s)%n", name, id, special);
    String patientsInfo = "담당 환자 목록: \n";
    for (Patient patient : patients) {
      patientsInfo += " - " + patient.toString() + "\n";
    }

    return doctorInfo + patientsInfo;
  }
}
