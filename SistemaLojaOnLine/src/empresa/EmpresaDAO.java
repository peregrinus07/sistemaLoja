package empresa;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
*
* @author tiberio cezar
*/

@ManagedBean (name ="EmpresaDAO")
@ViewScoped
public class EmpresaDAO {
  
	EntityManagerFactory ef;
	EntityManager e;
	
	
	
	public void criarTabelas() {
		
		
		Empresa emp = new Empresa();
		
		emp.setDescricao("Persevere");
		emp.setNomeDaEmpresa("Ninho dos Falcoes");
		
		
		ef = Persistence.createEntityManagerFactory("sistemaLoja");
		
		e = ef.createEntityManager();
		
		 
		e.getTransaction().begin();
		
		
		e.persist(emp);
		e.getTransaction().commit();
		
		
		e.close();
		ef.close();
		
		
	}
	
	
 
}