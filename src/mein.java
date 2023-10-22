import java.util.List;
import java.util.ArrayList;

public class mein {
    public static void main(String[] args) {
        List<Videojuego> JuegosNintendo = new ArrayList<Videojuego>();

        JuegosNintendo.add(new Videojuego("1232", "Mario 64", "Nintendo 64", 2, "Aventura"));
        JuegosNintendo.add(new Videojuego("4543", "Pokemon Soul Silver", "Nintendo DS", 1, "Aventura"));
        JuegosNintendo.add(new Videojuego("7134", "Smash Bros Ultimate", "Nintendo Swith", 2, "Pelea"));
        JuegosNintendo.add(new Videojuego("8762", "Mario Kart 8 Deluxe", "Nintendo 64", 4, "Aventura"));
        JuegosNintendo.add(new Videojuego("9271", "Super Mario Bros de wii", "Nintendo Wii", 1, "Aventura"));

        String nombreBuscado1 = "Super Mario Bros de wii";
        String nombreBuscado2 = "Smash Bros Ultimate";

        for (Videojuego jueguito : JuegosNintendo) {
            System.out.println(jueguito.toString());
        }

        System.out.println("--- Aqui cambio dos 'titulos' y dos 'cantidad de jugadores' --- ");

        for (Videojuego jueguito : JuegosNintendo) {
            if (jueguito.getTitulo().equals(nombreBuscado1)) {
                jueguito.setTitulo("Super Mario Bros.wii");
                jueguito.setCantJugadores(2);
            }
            if (jueguito.getTitulo().equals(nombreBuscado2)) {
                jueguito.setTitulo("Smash Bros");
                jueguito.setCantJugadores(8);
            }
        }

        System.out.println("\n\n");

        for (Videojuego jueguito : JuegosNintendo) {
            System.out.println(jueguito.toString());
        }
        System.out.println("\n\n");

        System.out.println("--- Se mostrarán solo los juegos de la consola 'Nintendo 64' ---");

        for (Videojuego jueguito : JuegosNintendo) {
            if (jueguito.getConsola().equals("Nintendo 64")) {
                System.out.println(" Un juego de nintendo 64 es: " + jueguito.getTitulo());
            }
        }
    }
}
