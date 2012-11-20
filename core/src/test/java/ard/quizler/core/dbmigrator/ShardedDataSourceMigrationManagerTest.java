package ard.quizler.core.dbmigrator;

import ard.quizler.core.carbonfive.Carbon5AbstractDataDrivenTest;
import ard.quizler.core.carbonfive.ShardedCarbon5AbstractDataDrivenTest;
import ard.quizler.core.sample.beans.TestEntity;
import ard.quizler.core.sample.dao.TestEntityDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Test for {@link ShardedDataSourceMigrationManager} class.
 */
@Carbon5AbstractDataDrivenTest.DataSet(locations = "dataset/test-entity-set.xml")
@ContextConfiguration(locations = { "classpath:spring-sharded.xml" })
public class ShardedDataSourceMigrationManagerTest extends ShardedCarbon5AbstractDataDrivenTest {

    @Autowired
    private TestEntityDao dao;

    @Autowired
    private ShardProvider shardProvider;

    @Autowired
    private ShardedDataSourceSelector dataSourceSelector;

    @Test
    public void testMigrate() throws Exception {
        for(Integer shardID  : shardProvider.getShardIDs()) {
            dataSourceSelector.switchShard(shardID);
            TestEntity entity = dao.get(1L);

            assertNotNull(entity);
            assertEquals(Long.valueOf(1L), entity.getId());
        }
    }
}
