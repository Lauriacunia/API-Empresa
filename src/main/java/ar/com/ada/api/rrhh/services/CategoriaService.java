package ar.com.ada.api.rrhh.services;

import ar.com.ada.api.rrhh.repos.CategoriaRepository;
@Service
public class CategoriaService {
   
    @Autowired
    CategoriaRepository categoriaRepository;

    //Buscar todas las categorias sin empleados y mostrarlas por nombre

    public List<Categorias> buscarTodasLasCategorias() {

        return categoriaRepository.findAllOrderByNombre();
    }
    
}