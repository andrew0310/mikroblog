package com.sda.javagda17.mikroblog.repository;

import com.sda.javagda17.mikroblog.model.Wpis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WpisRepository extends JpaRepository<Wpis, Long> {
}
