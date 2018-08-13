package pvt.springboot1.springboot1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pvt.springboot1.springboot1.modelo.Usuario;

public interface  UsuarioRepository extends JpaRepository<Usuario, Long>{

}
