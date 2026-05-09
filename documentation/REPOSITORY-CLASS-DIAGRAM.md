# Repository Class Diagram

```mermaid
classDiagram
    class Repository~T, ID~ {
        <<interface>>
        +save(T entity)
        +findById(ID id) Optional~T~
        +findAll() List~T~
        +delete(ID id)
    }

    class UserRepository {
        <<interface>>
        +findByEmail(String email) Optional~User~
    }

    class InMemoryRepository~T, ID~ {
        <<abstract>>
        -Map~ID, T~ storage
        +save(T entity)
        +findById(ID id) Optional~T~
        +findAll() List~T~
        +delete(ID id)
    }

    class InMemoryUserRepository {
        +findByEmail(String email) Optional~User~
    }

    class DatabaseUserRepository {
        +save(User entity)
        +findById(String id) Optional~User~
        +findAll() List~User~
        +delete(String id)
        +findByEmail(String email) Optional~User~
    }

    class RepositoryFactory {
        +getUserRepository(StorageType storageType) UserRepository
        +getRoleRepository(StorageType storageType) RoleRepository
        +getVehicleRepository(StorageType storageType) VehicleRepository
    }

    class StorageType {
        <<enumeration>>
        MEMORY
        DATABASE
        FILESYSTEM
        API
    }

    Repository~T, ID~ <|-- UserRepository
    Repository~T, ID~ <|.. InMemoryRepository~T, ID~
    InMemoryRepository~T, ID~ <|-- InMemoryUserRepository
    UserRepository <|.. InMemoryUserRepository
    UserRepository <|.. DatabaseUserRepository
    RepositoryFactory ..> UserRepository : creates
    RepositoryFactory ..> StorageType : uses
```

The repository layer uses interface-based contracts so business logic stays independent of storage concerns. `InMemory*Repository` classes are the active implementation for now, while `DatabaseUserRepository` is a deliberate stub that demonstrates how a future database backend can plug in by implementing the same `UserRepository` interface. `RepositoryFactory` and `StorageType` centralize backend selection and preserve a stable abstraction boundary for future extensions.
