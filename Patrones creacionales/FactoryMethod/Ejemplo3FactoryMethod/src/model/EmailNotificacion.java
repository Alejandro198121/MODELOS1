package model;

import model.abstracto.Notificacion;

public class EmailNotificacion extends Notificacion {

    public EmailNotificacion() {
        this.mensaje = "Enviando notificación por Email...";
    }

    @Override
    public String enviar() {
        return mensaje + " ¡Notificación enviada por correo electrónico!";
    }
}