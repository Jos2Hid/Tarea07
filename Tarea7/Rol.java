package Ejercicio_2;
public class Rol {
    private int id;
    private String nombre;
    private RolPermiso[] rolPermiso;
    private int indice;
    public Rol(){
        this.indice = 0;
        this.rolPermiso = new RolPermiso[3];
    }
    public Rol(int id, String nombre) {
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
    public void agregarRolPermiso(RolPermiso rolPermiso){
        this.rolPermiso[this.indice] = rolPermiso;
        this.indice++;
    }
    public void listarRolPermiso(){
        for(int i=0;i<this.indice;i++){
            System.out.println("Id del rol: "+rolPermiso[i].getRol().getId());
            System.out.println("Nombre del rol: "+ rolPermiso[i].getRol().getNombre());
            System.out.println("Id de permiso: "+ rolPermiso[i].getPermiso().getId());
            System.out.println("Nombre del permiso: "+rolPermiso[i].getPermiso().getNombre());
            System.out.println(" ");
        }
    }

    public String buscarPermisoNombre(Permiso nombre){
        for(int i=0;i<this.indice;i++){
            if(this.rolPermiso[i].getPermiso().getNombre() == nombre.getNombre()) {
                return "Encontrado";
            }
        }
        return "No encontrado";
    }
    public String buscarPermisoId(Permiso id){
        for(int i=0;i<this.indice;i++){
            if(this.rolPermiso[i].getPermiso().getId() == id.getId()) {
                return "Encontrado";
            }
        }
        return "No encontrado";
    }

    public void editarDato(Permiso id){
        int a = 0;
        for(int i=0;i<this.indice;i++){
            if(this.rolPermiso[i].getPermiso().getId() == id.getId()) {
                rolPermiso[i].getPermiso().setNombre("Asignar");
                rolPermiso[i].getPermiso().setId(2432);

                listarRolPermiso();
                System.out.println("El arreglo "+i+" fue el que se modificó");
                System.out.println(" ");
                a--;
            }
            a++;
        }
        while(a == 3) {
            System.out.println("No se encontró el id del permiso que ingresó");
            System.out.println(" ");
            a++;
        }
    }
    public int buscarPermisoId2(Permiso id){
        for(int i=0;i<this.indice;i++){
            if(this.rolPermiso[i].getPermiso().getId() == id.getId()) {
                return i;
            }
        }
        return -1;
    }
    public void eliminarDato(Permiso id){
        int a = buscarPermisoId2(id);
        if(a>-1){
            for(int i=a;i<this.indice-1;i++) {
                this.rolPermiso[i] = this.rolPermiso[i+1];
            }
            indice--;
            listarRolPermiso();
        }
        else{
            System.out.println("No se encontró el dato");
        }
    }
    public void ordenarPermisoId(){
        for(int i=0;i<this.indice -1;i++){
            for(int j=0;j<this.indice -i -1;j++){
                if(this.rolPermiso[j].getPermiso().getId() > this.rolPermiso[j+1].getPermiso().getId()){
                    RolPermiso temp = this.rolPermiso[j];
                    this.rolPermiso[j] = this.rolPermiso[j+1];
                    this.rolPermiso[j+1] = temp;
                }
            }
        }
        listarRolPermiso();
    }
}
