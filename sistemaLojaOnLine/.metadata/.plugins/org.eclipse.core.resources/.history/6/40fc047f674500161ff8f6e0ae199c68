package pessoa;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="tb_Clientes")
public class Cliente extends Pessoa implements Serializable {

	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name="id_cliente")
	private Integer idCliente;
  
                 @Column(name = "setor_nome", length = 45)
                 private String setor;
 
                 
    /**
     * @return the idCliente
     */
    public Integer getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the setor
     */
    public String getSetor() {
        return setor;
    }

    /**
     * @param setor the setor to set
     */
    public void setSetor(String setor) {
        this.setor = setor;
    }
               
                  
}
