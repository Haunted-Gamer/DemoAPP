package repos;
import com.example.iceFrog.model.sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface saleRepo extends JpaRepository<sale,Long> {

}
