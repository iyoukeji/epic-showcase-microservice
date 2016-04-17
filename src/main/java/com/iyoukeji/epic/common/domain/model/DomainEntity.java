package com.iyoukeji.epic.common.domain.model;

import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.io.Serializable;

@MappedSuperclass
public abstract class DomainEntity extends AssertionConcern implements Serializable {

    @Version
    private long version;

    public DomainEntity() {
        super();
        this.setVersion(0);
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }
}
