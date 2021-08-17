package com.github.caiolima1991.citiesapi.countries.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.github.caiolima1991.citiesapi.countries.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
