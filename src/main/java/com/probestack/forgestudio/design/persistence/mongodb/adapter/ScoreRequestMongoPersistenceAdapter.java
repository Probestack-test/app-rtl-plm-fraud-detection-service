package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.ScoreRequestDomainRepository;
import com.probestack.forgestudio.design.model.ScoreRequest;
import com.probestack.forgestudio.design.persistence.mongodb.document.ScoreRequestDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.ScoreRequestMongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ScoreRequestMongoPersistenceAdapter implements ScoreRequestDomainRepository {
    private final ScoreRequestMongoRepository repository;

    public ScoreRequestMongoPersistenceAdapter(ScoreRequestMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public ScoreRequest save(ScoreRequest scoreRequest) {
        ScoreRequestDocument document = toDocument(scoreRequest);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<ScoreRequest> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<ScoreRequest> findAll() {
        return repository.findAll().stream().map(this::toDomain).toList();
    }

    @Override
    public boolean existsById(String id) {
        return repository.existsById(id);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public long count() {
        return repository.count();
    }

    private ScoreRequestDocument toDocument(ScoreRequest scoreRequest) {
        ScoreRequestDocument document = new ScoreRequestDocument();
        BeanUtils.copyProperties(scoreRequest, document);
        return document;
    }

    private ScoreRequest toDomain(ScoreRequestDocument document) {
        ScoreRequest domain = new ScoreRequest();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
