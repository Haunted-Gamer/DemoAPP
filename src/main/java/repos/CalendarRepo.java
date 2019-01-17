package repos;

import com.example.iceFrog.model.Calendar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

	@Repository
	public interface CalendarRepo extends JpaRepository<Calendar, Long> {
	}

