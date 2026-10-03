package com.probestack.forgestudio.design.persistence.mongodb.repository;

import com.probestack.forgestudio.design.persistence.mongodb.document.UpdateRuleRequestDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for UpdateRuleRequest documents.
 */
public interface UpdateRuleRequestMongoRepository extends MongoRepository<UpdateRuleRequestDocument, String> {
}
