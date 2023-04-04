import model.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //Se llama el metodo de la clase UIMenu del paquete ui
        
        Doctor myDoctor = new Doctor("Fabian Guarin","Pediatria");
        myDoctor.addAvailableAppointment(new Date(),"4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");
        myDoctor.addAvailableAppointment(null, "2pm");
        
       for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()){
            System.out.println(aA.getDate()+ " " + aA.getTime());
       }

       Patient myPatient = new Patient(" Juan", " juan@email.com");
        
       //llama el toString de la clase model.Patient
        //System.out.println(myPatient);
        //llama el toString de la clase model.Doctor
        System.out.println(myDoctor);

        //El objeto user esta tomando el comportamiento del objeto Doctor
        User user = new Doctor("Felipe", "felipe@homtial.com");
        user.showDataUser();
        User userPa = new Patient("Felipe", "felipe@homtial.com");
        userPa.showDataUser();

        User user1 = new User("Juan","juan@hotmail.com" ){
            @Override
            public void showDataUser() {
                System.out.println("Doctor\n");
                System.out.println("Hospital: Cruz verde");
                System.out.println("Departamento: Geriatria");
            }
        };
        //PAra llamarlo reutilizo el objeto user y llamo el metodo
        user1.showDataUser();

        //Utilizando la interfaz se crea un objeto instanciaodolo
        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };
    }
}


