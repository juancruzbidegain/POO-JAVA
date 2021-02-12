public class Doctor {
    static int id = 0;
    String name;
    String speciality;

    Doctor(){
        System.out.println("Constructor del objeto...");

    }

    Doctor(String name, String speciality){
        System.out.println("El nombre del Doctor asignado es: "+ name);
        this.name = name;
        this.speciality = speciality;
        id++;
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);

    }

    public void showId(){
        System.out.println("ID Doctor: "+ id);
    }



}
