package pos_java_jdbc.pos_java_jdbc;

import java.util.List;

import org.junit.Test;
import dao.UserPosDAO;
import model.Userposjava;

public class TesteBancoJdbc{
	
	@Test
	public void initBanco() {
		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();
		
		userposjava.setId(6L);
		userposjava.setNome("Amanda Jesus");
		userposjava.setEmail("amanda@gmail.com.br");
		
		userPosDAO.salvar(userposjava);
	}
	
	@Test
	public void initListar() {
		UserPosDAO dao = new UserPosDAO();
		try {
			List<Userposjava> list = dao.listar();
			
			for (Userposjava userposjava : list) {
				System.out.println(userposjava);
				System.out.println("------------------------------");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
