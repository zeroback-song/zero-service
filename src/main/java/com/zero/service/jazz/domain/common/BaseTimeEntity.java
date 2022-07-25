package com.zero.service.jazz.domain.common;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseTimeEntity extends BaseEntity {

    @CreatedDate
    private LocalDateTime createDate;

    @CreatedDate
    private  LocalDateTime modifiedDate;
}
