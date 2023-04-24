package nehoraii.project.pizzahut.repository;

import nehoraii.project.pizzahut.entity.InformationAboutCustomersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InformationAboutCustomersRepository extends JpaRepository<InformationAboutCustomersEntity,Long> {
}
