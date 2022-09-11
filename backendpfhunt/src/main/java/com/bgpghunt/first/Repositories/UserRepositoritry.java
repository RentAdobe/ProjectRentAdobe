package com.bgpghunt.first.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bgpghunt.first.EntityClass.User;


@Repository
public interface UserRepositoritry extends JpaRepository<User, Long> {

}
