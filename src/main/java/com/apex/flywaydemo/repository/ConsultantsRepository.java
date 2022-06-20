package com.apex.flywaydemo.repository;

import com.apex.flywaydemo.model.Consultants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultantsRepository extends JpaRepository<Consultants, Long> {

}
