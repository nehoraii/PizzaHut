package nehoraii.project.pizzahut.repository;

import nehoraii.project.pizzahut.entity.InformationAboutTheItemsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InformationAboutTheItemsRepository extends JpaRepository<InformationAboutTheItemsEntity,Long> {
}
