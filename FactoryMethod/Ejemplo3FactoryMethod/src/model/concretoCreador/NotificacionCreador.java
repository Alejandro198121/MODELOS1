package model.concretoCreador;

import model.EmailNotificacion;
import model.NotificacionPush;
import model.SMSNotificacion;
import model.abstracto.Notificacion;
import model.abstracto.NotificacionFactory;

public class NotificacionCreador implements NotificacionFactory {

    @Override
    public Notificacion crearNotificacion(int tipo) {
        switch (tipo) {
            case 1:
                return new EmailNotificacion();
            case 2:
                return new SMSNotificacion();
            case 3:
                return new NotificacionPush();
            default:
                throw new IllegalArgumentException("Tipo de notificación no válido.");
        }
    }
}