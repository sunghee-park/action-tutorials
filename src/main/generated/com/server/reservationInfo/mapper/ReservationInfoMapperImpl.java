package com.server.reservationInfo.mapper;

import com.server.reservationInfo.dto.ReservationInfoResponseDto;
import com.server.reservationInfo.entity.ReservationInfo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-01T13:37:26+0900",
    comments = "version: 1.5.1.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class ReservationInfoMapperImpl implements ReservationInfoMapper {

    @Override
    public ReservationInfoResponseDto reservationInfoToReservationInfoResponseDto(ReservationInfo reservationInfo) {
        if ( reservationInfo == null ) {
            return null;
        }

        long reservationInfoId = 0L;
        String shelterName = null;
        String geolocation = null;
        int capacity = 0;
        int reservedNum = 0;

        reservationInfoId = reservationInfo.getReservationInfoId();
        shelterName = reservationInfo.getShelterName();
        geolocation = reservationInfo.getGeolocation();
        capacity = reservationInfo.getCapacity();
        reservedNum = reservationInfo.getReservedNum();

        ReservationInfoResponseDto reservationInfoResponseDto = new ReservationInfoResponseDto( reservationInfoId, shelterName, geolocation, capacity, reservedNum );

        return reservationInfoResponseDto;
    }

    @Override
    public List<ReservationInfoResponseDto> reservationInfosToReservationInfoResponseDtos(List<ReservationInfo> reservationInfos) {
        if ( reservationInfos == null ) {
            return null;
        }

        List<ReservationInfoResponseDto> list = new ArrayList<ReservationInfoResponseDto>( reservationInfos.size() );
        for ( ReservationInfo reservationInfo : reservationInfos ) {
            list.add( reservationInfoToReservationInfoResponseDto( reservationInfo ) );
        }

        return list;
    }
}
