package main.java.org.bedu.java.backend.veterinaria.repository;



@Repository
public interface VeterinarioRepository extends CrudRepository<Veterinario,Long> {

    List<Veterinario> findAll();
    
}
