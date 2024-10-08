package model;

import model.abstracto.Notificacion;

public class SMSNotificacion extends Notificacion {

    public SMSNotificacion() {
        this.mensaje = "Enviando notificación por SMS...";
    }

    @Override
    public String enviar() {
        return mensaje + " ¡Notificación enviada por mensaje de texto!";
    }
}