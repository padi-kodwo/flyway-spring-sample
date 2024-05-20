package com.padi.flyway.repo;

import com.padi.flyway.domain.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepo extends PagingAndSortingRepository<User, String>, CrudRepository<User, String>, JpaSpecificationExecutor<User> {
}
