package co.edu.unisabana.parcial.service;

import co.edu.unisabana.parcial.repository.sql.entity.Checkpoint;
import co.edu.unisabana.parcial.service.model.Checkin;
import co.edu.unisabana.parcial.service.model.Checkout;

public interface ICheckpointRepository {
    public Checkin toCheckin() {
    }

    public static Checkpoint fromCheckin(Checkin checkin) {
    }

    public static Checkpoint fromCheckout(Checkout Checkout) {
    }
}
