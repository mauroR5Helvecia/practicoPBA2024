package practicoPBA2024;

public abstract class Video implements Visualizable {

    protected String titulo;
    protected Integer anio;
    protected String genero;
    protected Integer duracion;
    protected boolean visto;
    protected Integer tiempoVisto;
    protected Integer calificacion;

    public Video(String titulo, Integer anio, String genero, Integer duracion, boolean visto, Integer tiempoVisto, Integer calificacion) {
        this.titulo = titulo;
        this.anio = anio;
        this.genero = genero;
        this.duracion = duracion;
        this.visto = visto;
        this.tiempoVisto = tiempoVisto;
        this.calificacion = calificacion;
    }

    public Video() {
    }

    // Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public Integer getTiempoVisto() {
        return tiempoVisto;
    }

    public void setTiempoVisto(Integer tiempoVisto) {
        this.tiempoVisto = tiempoVisto;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

}
