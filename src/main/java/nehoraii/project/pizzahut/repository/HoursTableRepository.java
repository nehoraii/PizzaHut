package nehoraii.project.pizzahut.repository;

import nehoraii.project.pizzahut.entity.HoursTableEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HoursTableRepository extends JpaRepository<HoursTableEntity,Long> {
}
