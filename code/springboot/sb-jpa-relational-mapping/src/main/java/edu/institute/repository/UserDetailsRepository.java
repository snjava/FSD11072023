package edu.institute.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.institute.entity.UserDetails;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer> {

}
