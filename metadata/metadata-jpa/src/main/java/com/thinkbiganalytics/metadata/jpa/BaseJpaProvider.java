package com.thinkbiganalytics.metadata.jpa;

import com.thinkbiganalytics.jpa.AbstractJpaProvider;

import org.springframework.beans.factory.annotation.Qualifier;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by sr186054 on 5/4/16.
 */
public abstract class BaseJpaProvider<T, PK extends Serializable> extends AbstractJpaProvider<T, PK> {

    @PersistenceContext
    @Inject
    @Qualifier("metadataEntityManager")
    protected EntityManager entityManager;

    public  EntityManager getEntityManager() {
        return entityManager;
    }

}