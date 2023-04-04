package model;

public class Patient extends User{

    //Atributos
        private String birthday;
        private double weight;
        private double height;
        private String blood;

       //Constructor
        public Patient(String name, String email){
            //Super es referente al metodo contructor de la clase model.User
            super(name, email);
        }

        //Se ingresa 54.5
        public void setWeight(double weight){
            this.weight = weight;
        }

        //Siempre me devuelva formato 54,5 kg. String
        public String getWeight(){
            return this.weight + " kg.";
        }

        public String getBirthday() {
            return birthday;
        }

        public String getHeight() {
            return this.height + (" m");
        }

        public String getBlood() {
            return blood;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public void setBlood(String blood) {
            this.blood = blood;
        }

        //llamo el metodo toString
        @Override
        public String toString() {
         // TODO Auto-generated method stub
        return super.toString() + "\nAge: " + birthday + "Weight: " + getWeight() 
        + "\nHeight: "+ getHeight() + "\nBlood: "+ blood;
        }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Hitorial completo desde el nacimiento");
    }
}
