package model;

import model.abstracto.Notificacion;

public class NotificacionPush extends Notificacion {

    public NotificacionPush() {
        this.mensaje = "Enviando notificación Push...";
    }

    @Override
    public String enviar() {
        return mensaje + " ¡Notificación push enviada al dispositivo!";
    }
}