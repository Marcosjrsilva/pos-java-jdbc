package pos_java_jdbc.pos_java_jdbc;

import org.junit.Test;
import canexaojdbc.SingleConnection;
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

}
