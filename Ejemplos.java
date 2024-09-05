
package tp5;

public class Ejemplos {

    private static Directoriotelefonico directorio = new Directoriotelefonico();

    public static void main(String[] args) {
      
        directorio.agregarContacto(123456789L, new Contacto("20123456", "ian", "Pérez", "Buenos Aires", "Calle angosta 1222"));
        directorio.agregarContacto(987654321L, new Contacto("10987654", "kevin", "García", "san luis", "Calle no tan angosta 4563"));
        directorio.agregarContacto(555555555L, new Contacto("32555555", "ximena", "cuello", "Mendoza", "Calle x 7559"));

      
        JFrame frame = new JFrame("Directorio Telefónico");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
      
}