package com.zero.service.hiphop.domain.common;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseTimeEntity extends BaseEntity {

    @CreatedDate
    private LocalDateTime createDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;
}
