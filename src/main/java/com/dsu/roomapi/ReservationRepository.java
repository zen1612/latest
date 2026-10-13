package com.dsu.roomapi;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ReservationRepository extends JpaRepository<Reservation,Long>{

    List<Reservation> findByRoomIdOrderByStartTime(Long roomid);

    boolean existsbyRoomId(Long roomId);


}

where r1_0.room_id=?
order by r1_0.start_time
