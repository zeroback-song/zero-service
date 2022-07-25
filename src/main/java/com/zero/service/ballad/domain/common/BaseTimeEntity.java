package com.zero.service.ballad.domain.common;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseTimeEntity extends BaseEntity {

    @CreatedDate
    private LocalDateTime createdAt;

    private LocalDateTime modifiedAt;

}
