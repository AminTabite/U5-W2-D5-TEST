package amintabite.U5_W2_D5_TEST.Repositories;

import amintabite.U5_W2_D5_TEST.Entities.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DipendenteRepository extends JpaRepository<Dipendente, Long> {
}
