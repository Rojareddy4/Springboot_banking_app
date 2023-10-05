package com.cg.banking.model.mapper;

import com.cg.banking.entities.AccountEntity;
import com.cg.banking.model.dto.Account;

public abstract class BaseMapper {
	public abstract class BaseMapper<E, D> {
	    public abstract E convertToEntity(D dto, Object... args);

	    public abstract D convertToDto(E entity, Object... args);

	    public Collection<E> convertToEntity(Collection<D> dto, Object... args) {
	        return dto.stream().map(d -> convertToEntity(d, args)).collect(Collectors.toList());
	    }

	    public Collection<D> convertToDto(Collection<E> entity, Object... args) {
	        return entity.stream().map(e -> convertToDto(e, args)).collect(Collectors.toList());
	    }

	    public List<E> convertToEntityList(Collection<D> dto, Object... args) {
	        return convertToEntity(dto, args).stream().collect(Collectors.toList());
	    }
	    public List<D> convertToDtoList(Collection<E> entity, Object... args) {
	        return convertToDto(entity, args).stream().collect(Collectors.toList());
	    }

	    public Set<E> convertToEntitySet(Collection<D> dto, Object... args) {
	        return convertToEntity(dto, args).stream().collect(Collectors.toSet());
	    }

	    public Set<D> convertToDtoSet(Collection<E> entity, Object... args) {
	        return convertToDto(entity, args).stream().collect(Collectors.toSet());
	    }
	}

	public Account convertToDto(AccountEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public AccountEntity convertToEntity(Account dto) {
		// TODO Auto-generated method stub
		return null;
	}

}