package org.cnam.sample.repository;

import org.cnam.sample.domain.Sample;
import org.cnam.sample.model.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<PersonModel,Long> {
}
