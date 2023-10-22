

public class Videojuego
{
    String codigo;
    String titulo;
    String consola;
    int cantJugadores;
    String genero;

    public Videojuego(){

    }

    public Videojuego(String codigo, String titulo, String consola, int cantJugadores, String genero)
    {
        this.codigo = codigo;
        this.titulo = titulo;
        this.consola = consola;
        this.cantJugadores = cantJugadores;
        this.genero = genero;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public int getCantJugadores() {
        return cantJugadores;
    }

    public void setCantJugadores(int cantJugadores) {
        this.cantJugadores = cantJugadores;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", consola='" + consola + '\'' +
                ", cantJugadores=" + cantJugadores +
                ", genero='" + genero + '\'' +
                '}';
    }
}