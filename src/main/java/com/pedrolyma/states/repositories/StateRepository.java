package com.pedrolyma.states.repositories;

import com.pedrolyma.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
