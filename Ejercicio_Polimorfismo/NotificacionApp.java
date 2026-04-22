public class NotificacionApp extends Notificacion {

    public NotificacionApp(String codigo, String destinatario, String mensaje) {
        super(codigo, destinatario, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("---- APP ----");
        System.out.println("Usuario: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
        estado = EstadoNotificacion.ENVIADO;
    }
}