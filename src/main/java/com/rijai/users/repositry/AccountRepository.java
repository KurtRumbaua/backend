package com.rijai.users.repositry;

import com.rijai.users.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository <Account, Long> {
}
