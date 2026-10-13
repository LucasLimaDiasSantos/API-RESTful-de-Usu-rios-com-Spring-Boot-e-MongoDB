package lucas.api_usuario.infrastructure.repository;

import lucas.api_usuario.infrastructure.entities.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario,String> {
}
