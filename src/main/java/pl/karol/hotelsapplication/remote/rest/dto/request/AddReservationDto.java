package pl.karol.hotelsapplication.remote.rest.dto.request;

import pl.karol.hotelsapplication.remote.rest.dto.common.PersonDto;
import pl.karol.hotelsapplication.remote.rest.dto.common.ReservationDto;

import java.util.List;

public class AddReservationDto {
    private List<ReservationDto> hotels;
    private PersonDto person;

    public AddReservationDto() {
    }

    public AddReservationDto(List<ReservationDto> hotels, PersonDto person) {
        this.hotels = hotels;
        this.person = person;
    }

    public List<ReservationDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<ReservationDto> hotels) {
        this.hotels = hotels;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
