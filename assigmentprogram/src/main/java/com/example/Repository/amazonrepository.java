package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Amazon;

public interface amazonrepository extends JpaRepository<Amazon, Integer> {

}
