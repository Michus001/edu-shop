package cz.vse.java.edushop;

import cz.vse.java.edushop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
