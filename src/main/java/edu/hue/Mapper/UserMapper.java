package edu.hue.Mapper;

import edu.hue.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface UserMapper extends JpaRepository<User,Integer>,JpaSpecificationExecutor<User> {

}
