package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

import pessoa.Funcionario;

public class FuncionarioDAO {
	  
		   
        private EntityManagerFactory factory = Persistence.createEntityManagerFactory("sistemaLoja");
        private EntityManager em = factory.createEntityManager();
   
        public Funcionario getUsuario(String nomeUsuario, String senha) {
   
              try {
                    Funcionario funcionario = (Funcionario) em.createQuery("SELECT u from Usuario u where u.nomeUsuario = :name and u.senha = :senha")
                               .setParameter("name", nomeUsuario)
                               .setParameter("senha", senha).getSingleResult();
   
                    return funcionario;
              } catch (NoResultException e) {
                    return null;
              }
 	
        	}

        
        public boolean inserirUsuario(Funcionario funcionario) {
            try {
                  em.persist(funcionario);
                  em.getTransaction().commit();
                  return true;
            } catch (Exception e) {
                  e.printStackTrace();
                  return false;
            }
      }
        
      
        public boolean deletarUsuario(Funcionario funcionario) {
            try {
                  em.remove(funcionario);
                  return true;
            } catch (Exception e) {
                  e.printStackTrace();
                  return false;
            }
      }
        
        
      public void feicharConexao() {
    	  
    	  
    	  this.em.close();
    	  this.factory.close();
     	  
      }  
        
        
        
        
}
	
 
