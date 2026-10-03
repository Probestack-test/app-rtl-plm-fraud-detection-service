package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.CaseListResponse;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for CaseListResponse domain operations.
 */
public interface CaseListResponseDomainRepository {
    CaseListResponse save(CaseListResponse caseListResponse);

    Optional<CaseListResponse> findById(String id);

    List<CaseListResponse> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
