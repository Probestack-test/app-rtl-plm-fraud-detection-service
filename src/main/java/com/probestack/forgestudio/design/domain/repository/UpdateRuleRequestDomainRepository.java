package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.UpdateRuleRequest;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for UpdateRuleRequest domain operations.
 */
public interface UpdateRuleRequestDomainRepository {
    UpdateRuleRequest save(UpdateRuleRequest updateRuleRequest);

    Optional<UpdateRuleRequest> findById(String id);

    List<UpdateRuleRequest> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
