public class NotificacionEmail extends Notificacion {

    private String asunto;

    public NotificacionEmail(String codigo, String destinatario, String mensaje, String asunto) {
        super(codigo, destinatario, mensaje);
        this.asunto = asunto;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    @Override
    public void enviar() {
        System.out.println("---- EMAIL ----");
        System.out.println("Para: " + destinatario);
        System.out.println("Asunto: " + asunto);
        System.out.println("Mensaje: " + mensaje);
        estado = EstadoNotificacion.ENVIADO;
    }

    @Override
    public String toString() {
        return super.toString() + " NotificacionEmail{" +
                "asunto='" + asunto + '\'' +
                '}';
    }
}