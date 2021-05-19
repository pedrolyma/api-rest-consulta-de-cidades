package com.pedrolyma.countries.repositories;

import com.pedrolyma.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
