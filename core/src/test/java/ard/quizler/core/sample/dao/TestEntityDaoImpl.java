package ard.quizler.core.sample.dao;

import ard.quizler.core.dao.BaseDaoImpl;
import ard.quizler.core.sample.beans.TestEntity;

/**
 * Dao for {@link TestEntity} class.
 */
public class TestEntityDaoImpl extends BaseDaoImpl<TestEntity> implements TestEntityDao {
    public TestEntityDaoImpl() {
        super(TestEntity.class);
    }
}
