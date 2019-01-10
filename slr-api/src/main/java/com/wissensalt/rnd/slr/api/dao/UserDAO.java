package com.wissensalt.rnd.slr.api.dao;

import com.wissensalt.rnd.slr.shared.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created on 1/3/19.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface UserDAO extends JpaRepository<User, Long> {

    User findByCode(String p_UserName);
}
