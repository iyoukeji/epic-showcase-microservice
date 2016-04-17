package com.iyoukeji.epic.common.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public interface DomainEvent extends Serializable {

    /**
     * 取得事件名称
     *
     * @return 事件名称
     */
    default String getEventName() {
        return this.getClass().getSimpleName();
    }

    /**
     * 取得事件触发时间
     *
     * @return 事件触发时间
     */
    Date getOccurredOn();
}
