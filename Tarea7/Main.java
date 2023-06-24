package Ejercicio_2;

public class Main {
    public static void main(String[] args) {
        //INGRESAR DATOS
        Rol rol = new Rol();
        rol.agregarRolPermiso(new RolPermiso(new Rol(1231,"Admin"),
                new Permiso(24234,"Agregar")));
        rol.agregarRolPermiso(new RolPermiso(new Rol(35234,"Gerente"),
                new Permiso(32367,"Editar")));
        rol.agregarRolPermiso(new RolPermiso(new Rol(23465,"Coordinador"),
                new Permiso(14428,"Eliminar")));

        Permiso id = new Permiso(323);
        Permiso nombre = new Permiso("Agregar");

        /*
        //LISTAR DATOS
        rol.listarRolPermiso();

        //BUSCAR POR NOMBRE DEL PERMISO
        System.out.println(rol.buscarPermisoNombre(nombre));

        //BUSCAR POR ID DEL PERMISO
        System.out.println(rol.buscarPermisoId(id));

        //EDITAR DATO POR ID DEL PERMISO
        //rol.editarDato(id);

        //ELIMINAR DATO
        rol.eliminarDato(id);
        */

        rol.ordenarPermisoId();
    }

}
