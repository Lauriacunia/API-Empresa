package ar.com.ada.api.rrhh.entities;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "empleado")
public class Empleado {

  @Id
  @Column(name = "empleado_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int empleadoId;
  private String nombre;
  private int edad;
  private BigDecimal sueldo;
  @Column(name = "estado_id")
  private int estado;
  @Column(name = "fecha_alta")
  private Date fechaAlta;
  @Column(name = "fecha_baja")
  private Date fechaBaja;

  @ManyToOne
  @JoinColumn(name = "categoria_id", referencedColumnName = "categoria_id")
  private Categoria categoria;

}