package com.carwash.repository.inmemory;

import com.carwash.domain.Role;
import com.carwash.repository.RoleRepository;

public class InMemoryRoleRepository extends InMemoryRepository<Role, String> implements RoleRepository {
    @Override
    protected String getId(Role entity) {
        return entity.getRoleId();
    }
}
