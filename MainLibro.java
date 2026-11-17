public class MainLibro {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Juego de tronos", "George R. R. Martin", 1996);
        Libro libro2 = new Libro("Alas de sangre", "Rebecca Yarros", 2023);

        System.out.println("El libro se llama " + libro1.titulo + " de " + libro1.autor + " (" + libro1.año + ")");
        System.out.println("El libro se llama " + libro2.titulo + " de " + libro2.autor + " (" + libro2.año + ")");
    }
}