package com.ReServeback;

import com.ReServeback.models.Giveaway;
import com.ReServeback.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByEmail(String email);
}
