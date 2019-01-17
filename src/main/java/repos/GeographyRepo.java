package repos;

import com.example.iceFrog.model.Geography;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface GeographyRepo extends JpaRepository<Geography, Long> {

}
