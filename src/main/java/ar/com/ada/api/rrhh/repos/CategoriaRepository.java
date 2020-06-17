package ar.com.ada.api.rrhh.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.ada.api.rrhh.entities.Categoria;
@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, Integer>{



    // TRAER LISTA DE CATEGORIAS SIN EMPLEADO
    @Query("select c from Categoria c order by nombre")
    List<Huesped> findAllOrderByNombre();

    
}