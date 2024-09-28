package practicoPBA2024;

public class Serie extends Video {

    public Capitulo[] listaCapitulos = new Capitulo[100];

    private static int indiceCapitulos = 0;
    private Integer temporadas;

    public Serie(Integer temporadas) {
        this.temporadas = temporadas;
    }

    public Serie(String titulo, Integer anio, String genero, Integer duracion, boolean visto, Integer tiempoVisto, Integer calificacion, Integer temporadas) {
        super(titulo, anio, genero, duracion, visto, tiempoVisto, calificacion);
        this.temporadas = temporadas;
    }

    public Serie() {
    }

    public Integer getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Integer temporadas) {
        this.temporadas = temporadas;
    }

    public Capitulo[] getListaCapitulos() {
        return listaCapitulos;
    }

    public void setListaCapitulos(Capitulo[] listaCapitulos) {
        this.listaCapitulos = listaCapitulos;
    }

    public static int getIndiceCapitulos() {
        return indiceCapitulos;
    }

    public static void setIndiceCapitulos(int indiceCapitulos) {
        Serie.indiceCapitulos = indiceCapitulos;
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
            System.out.println("Ingrese una calificacion con un valor de entre 1 y 10");
        }
    }

    public void agregarCapitulo(Capitulo capitulo) {
        if (indiceCapitulos < listaCapitulos.length) {
            listaCapitulos[indiceCapitulos++] = capitulo;
            System.out.println("Capítulo agregado: " + capitulo.getTitulo());
        } else {
            System.out.println("No se pueden agregar más capítulos. La lista esta llena.");
        }

    }
}
