package ard.quizler.core.entity;

import java.util.Date;

public interface AuditedEntity {

    String getCreatedBy();
    Date getCreatedTime();
    String getLastUpdatedBy();
    Date getLastUpdatedTime();
}
