package practicoPBA2024;

public class Capitulo extends Video {

    public Capitulo(String titulo, Integer anio, String genero, Integer duracion, boolean visto, Integer tiempoVisto, Integer calificacion) {
        super(titulo, anio, genero, duracion, visto, tiempoVisto, calificacion);
    }

    public Capitulo() {
    }

    @Override
    public void tiempoVisto(Integer tiempo) {
        if (tiempo <= duracion && tiempo > 0) {
            setTiempoVisto(tiempo);
            setVisto(true);
            System.out.println("Se actualizo el tiempo visto de " + getTitulo() + " a " + tiempo + " minutos.");
        } else {
            System.out.println("El tiempo visto debe ser menor a la duracion de la pelicula, que es " + getDuracion() + " minutos");
        }
    }

    @Override
    public void ponerCalificacion(Integer calificacion) {
        if (calificacion <= 10 && calificacion > 0) {
            setCalificacion(calificacion);
            System.out.println("La calificacion de " + getTitulo() + " ha sido actualizada a " + calificacion + " puntos");
        } else {
            System.out.println("Ingrese una calificadion con un valor de entre 1 y 10");
        }
    }

}
