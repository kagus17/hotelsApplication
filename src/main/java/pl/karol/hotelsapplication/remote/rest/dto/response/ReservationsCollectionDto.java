package pl.karol.hotelsapplication.remote.rest.dto.response;

import java.util.List;

public class ReservationsCollectionDto {
    private List<ReservationStatusDto> reservations;

    public ReservationsCollectionDto() {
    }

    public ReservationsCollectionDto(List<ReservationStatusDto> reservations) {
        this.reservations = reservations;
    }

    public List<ReservationStatusDto> getReservations() {
        return reservations;
    }

    public void setReservations(List<ReservationStatusDto> reservations) {
        this.reservations = reservations;
    }
}
