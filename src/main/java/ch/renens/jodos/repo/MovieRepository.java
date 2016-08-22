package ch.renens.jodos.repo;

import ch.renens.jodos.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}