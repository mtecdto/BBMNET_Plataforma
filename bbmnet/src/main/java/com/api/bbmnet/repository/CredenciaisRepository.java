package com.api.bbmnet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.bbmnet.entity.CredenciaisEntity;

@Repository
public interface CredenciaisRepository extends JpaRepository<CredenciaisEntity, Long>{

}
