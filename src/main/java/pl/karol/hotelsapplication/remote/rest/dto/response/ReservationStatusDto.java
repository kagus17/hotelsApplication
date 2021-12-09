package pl.karol.hotelsapplication.remote.rest.dto.response;

import pl.karol.hotelsapplication.domain.model.StatusType;
import pl.karol.hotelsapplication.remote.rest.dto.common.ReservationDto;
import pl.karol.hotelsapplication.remote.rest.dto.common.PersonDto;

import java.util.List;

public class ReservationStatusDto {
    private Integer id;
    private StatusType status;
    private List<ReservationDto> rooms;
    private PersonDto person;

    public ReservationStatusDto() {
    }

    public ReservationStatusDto(Integer id, StatusType status, List<ReservationDto> rooms, PersonDto person) {
        this.id = id;
        this.status = status;
        this.rooms = rooms;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    public List<ReservationDto> getRooms() {
        return rooms;
    }

    public void setRooms(List<ReservationDto> rooms) {
        this.rooms = rooms;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
