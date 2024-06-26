package web.term.club.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.term.club.domain.Club;
import web.term.club.domain.ClubInfo;

public interface ClubInfoRepository extends JpaRepository<ClubInfo, Long> {
    ClubInfo findByClub(Club club);
}
