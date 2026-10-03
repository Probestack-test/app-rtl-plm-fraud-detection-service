package com.probestack.forgestudio.design.persistence.mongodb.repository;

import com.probestack.forgestudio.design.persistence.mongodb.document.ScoreRequestDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for ScoreRequest documents.
 */
public interface ScoreRequestMongoRepository extends MongoRepository<ScoreRequestDocument, String> {
}
