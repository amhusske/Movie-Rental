package movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import movie.beans.MovieType;
@Repository
public interface MovieTypeRepository extends JpaRepository<MovieType, Long>{

}
