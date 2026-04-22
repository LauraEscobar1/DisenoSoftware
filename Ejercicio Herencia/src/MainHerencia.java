import Model.Libro;
import Model.Video;
import Model.Idioma;
import java.util.Scanner;

public class MainHerencia {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido de la editorial!");
        System.out.println("Vamos a crear un libro!!!");
        System.out.println("¿cuál es el título del libro?");
        String titulo = input.nextLine();
        System.out.println("¿cuál es el precio del libro?");
        double precio = input.nextDouble();
        System.out.println("¿cuál es el año de publicación del libro?");
        int anioPublicacion = input.nextInt();
        System.out.println("¿cuál es el número de páginas del libro?");
        int numeroPaginas = input.nextInt();
        Libro miLibro = new Libro(titulo, precio, anioPublicacion, numeroPaginas);
        System.out.println(miLibro);

        input.nextLine();

        // video
        System.out.println("\nAhora vamos a crear un video!");
        System.out.println("Título:");
        String tituloV = input.nextLine();
        System.out.println("Precio:");
        double precioV = input.nextDouble();
        System.out.println("Duración en horas:");
        float duracion = input.nextFloat();
        System.out.println("Idioma (1=Español, 2=Inglés, 3=Portugués):");
        int opcion = input.nextInt();

        Idioma idioma;

        switch (opcion) {
            case 1:
                idioma = Idioma.ESPANOL;
                break;
            case 2:
                idioma = Idioma.INGLES;
                break;
            case 3:
                idioma = Idioma.PORTUGUES;
                break;
            default:
                idioma = Idioma.ESPANOL;
        }

        Video miVideo = new Video(tituloV, precioV, idioma, duracion);
        System.out.println(miVideo);
    }
}