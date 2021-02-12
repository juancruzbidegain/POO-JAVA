import static ui.UiMenu.*;

public class Main {
    public static void main(String[] args) {
        //Instancia
      /*
      Doctor myDoctor = new Doctor();

       myDoctor.name = "Doctor Bidegain";
       myDoctor.showName();
       myDoctor.showId();
       System.out.println(Doctor.id);


       Doctor myDoctorAnn = new Doctor();
       myDoctorAnn.name = "Doctor Ann";
       myDoctorAnn.showName();
       myDoctorAnn.showId();
       System.out.println(Doctor.id);
       System.out.println("-----------");
      */

       //showMenu();

        Doctor doctor_1 = new Doctor("Juan Cruz", "Pediatria");
        System.out.println(doctor_1.name);
        System.out.println(doctor_1.speciality);
    }
}

