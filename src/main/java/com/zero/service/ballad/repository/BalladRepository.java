package com.zero.service.ballad.repository;

import com.zero.service.ballad.domain.Ballad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BalladRepository extends JpaRepository<Ballad, Long> {
}
