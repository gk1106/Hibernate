package com.springbootpractice.crudoperationusingjsp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootpractice.crudoperationusingjsp.entity.Laptop;

@Repository
public interface laptoprepo extends JpaRepository<Laptop, Integer> {

}
