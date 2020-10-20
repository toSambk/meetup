package org.example.graphql.repository;

import org.example.graphql.model.Wheel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WheelRepository extends JpaRepository<Wheel, Integer> {
}
