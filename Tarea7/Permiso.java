package Ejercicio_2;

public class Permiso {
    private int id;
    private String nombre;
    public Permiso(){
    }
    public Permiso(String nombre){
        this.nombre = nombre;
    }
    public Permiso(int id){
        this.id = id;
    }
    public Permiso(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
