public class NotificacionSMS extends Notificacion {

    public NotificacionSMS(String codigo, String destinatario, String mensaje) {
        super(codigo, destinatario, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("---- SMS ----");
        System.out.println("Para: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
        estado = EstadoNotificacion.ENVIADO;
    }
}