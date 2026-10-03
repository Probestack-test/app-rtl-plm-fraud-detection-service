package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.ScoreRequest;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for ScoreRequest domain operations.
 */
public interface ScoreRequestDomainRepository {
    ScoreRequest save(ScoreRequest scoreRequest);

    Optional<ScoreRequest> findById(String id);

    List<ScoreRequest> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
