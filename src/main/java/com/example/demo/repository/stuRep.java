package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Entity;



public interface stuRep extends JpaRepository<Entity, Integer>{

}
