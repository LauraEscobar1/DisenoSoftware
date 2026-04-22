public class MainPolimorfismo {

        public static void main(String[] args) {

                Notificacion email = new NotificacionEmail(
                                "001",
                                "estudiante@uni.edu",
                                "tus calificaciones están disponibles",
                                "Calificaciones");

                Notificacion sms = new NotificacionSMS(
                                "002",
                                "3001234567",
                                "Pago de matrícula pendiente");

                Notificacion app = new NotificacionApp(
                                "003",
                                "usuarioApp",
                                "Clase cancelada hoy");

                email.enviar();
                sms.enviar();
                app.enviar();

                System.out.println("\n--- Estados ---");
                System.out.println(email);
                System.out.println(sms);
                System.out.println(app);
        }
}
