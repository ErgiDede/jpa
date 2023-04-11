package com.jpa.mapper;

import com.jpa.model.entity.UserDetails;

public abstract class AbstractMapper<ENTITY, DTO> {

    public abstract UserDetails toEntity(UserDetails userDetails);

    public abstract ENTITY toEntity(DTO dto);
    public abstract DTO toDto(ENTITY entity);

}
