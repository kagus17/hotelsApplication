package pl.karol.hotelsapplication.remote.rest.dto.request;

import pl.karol.hotelsapplication.remote.rest.dto.common.PersonDto;
import pl.karol.hotelsapplication.remote.rest.dto.common.RoomReservationDto;

import java.util.List;

public class ReservationDto {
    private List<RoomReservationDto> hotels;
    private PersonDto person;

    public ReservationDto() {
    }

    public ReservationDto(List<RoomReservationDto> hotels, PersonDto person) {
        this.hotels = hotels;
        this.person = person;
    }

    public List<RoomReservationDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<RoomReservationDto> hotels) {
        this.hotels = hotels;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
