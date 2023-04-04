package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    //Atributos
    private String speciality;

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //Constructor
    public Doctor(String name, String email){
        //Super es referente al metodo contructor de la clase model.User
        super(name, email);
        System.out.println("El nombre del doctor asignado es: "+ name);
        //this.speciality = speciality;
    }

    //Comportamientos
    public void showName(){
        //System.out.println(name);
    }

    //Se crea un metodo
    public static void showId() {
        //System.out.println("ID model.Doctor: "+ id);
    }

    //Coleccion de objetos    
    ArrayList<AvailableAppointment> availableAppointments= new ArrayList<>();
    //Incrementar la lista y crear nuevas las citas 
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    //Devulve la lista completa de listas
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    //Sobreescribo el metodo toString
    @Override
    public String toString() {
        return super.toString() + "/Speciality: "+ speciality + "Available: " + availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado Hospital: Cruz roja");
        System.out.println("Departamento: Cancerelogia ");
    }

    //Clase anidada
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date,String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        //Sobreescribo el metodo toString
        @Override
        public String toString() {
            return "Available Appoiments \nDate: "+ date + "\nTime: "+ time;
        }
    }
}

