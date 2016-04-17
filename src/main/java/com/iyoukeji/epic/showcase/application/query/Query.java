package com.iyoukeji.epic.showcase.application.query;


import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.io.Serializable;

public interface Query extends Serializable {

    Specification<?> toSpecification();

    Pageable getPageable();
}
