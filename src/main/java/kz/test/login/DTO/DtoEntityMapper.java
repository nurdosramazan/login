package kz.test.login.DTO;

public interface EntityMapper <D, E> {
    E toEntity(D dtoObject);
    D toDto(E entity);
}
