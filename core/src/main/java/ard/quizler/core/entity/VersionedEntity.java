package ard.quizler.core.entity;

import java.io.Serializable;

public interface VersionedEntity extends Serializable {

    Long getId();

    int getVersion();
}
