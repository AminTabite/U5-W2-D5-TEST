package amintabite.U5_W2_D5_TEST.Repositories;

import amintabite.U5_W2_D5_TEST.Entities.Viaggio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViaggioRepository extends JpaRepository<Viaggio, Long> {
}
