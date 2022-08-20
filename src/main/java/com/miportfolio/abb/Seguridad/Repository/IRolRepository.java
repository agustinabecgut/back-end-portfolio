
package com.miportfolio.abb.Seguridad.Repository;

import com.miportfolio.abb.Seguridad.Entity.Rol;
import com.miportfolio.abb.Seguridad.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
    
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}
