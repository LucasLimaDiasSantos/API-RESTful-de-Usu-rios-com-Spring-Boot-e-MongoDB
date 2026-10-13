package lucas.api_usuario.controller;

import lucas.api_usuario.business.UsuarioService;
import lucas.api_usuario.infrastructure.entities.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<Usuario> salvarUsuario(@RequestBody Usuario usuario){
        return ResponseEntity.ok().body(usuarioService.salvarUsuario(usuario));
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> buscaUsuarios(){
        return ResponseEntity.ok().body(usuarioService.buscarUsuarios());
    }

    @PutMapping
    public ResponseEntity<Usuario> atualizarUsuario(@RequestBody Usuario usuario){
        return ResponseEntity.ok().body(usuarioService.atualizarUsuario(usuario));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarUsuario(@RequestParam("id")String id){
        usuarioService.deletarUsuario(id);
        return ResponseEntity.accepted().build();
    }
}
