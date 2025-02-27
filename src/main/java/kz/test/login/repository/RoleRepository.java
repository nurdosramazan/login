package kz.test.login.repository;

import kz.test.login.entity.Role;
import kz.test.login.exception.EntityNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
//    default Role findByIdOrThrow(Long id) {
//        return findById(id).orElseThrow(() -> new EntityNotFoundException("Role not found"));
//    }
}
