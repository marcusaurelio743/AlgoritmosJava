package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {
	
	public static Connection getConexao() {
		try {
			Properties pop = getProperties();
			final String stringConexao = pop.getProperty("banco.url");
			final String usuario = pop.getProperty("banco.usuario");
			final String senha = pop.getProperty("banco.senha");
			Connection conexao = DriverManager.getConnection(stringConexao, usuario, senha);
			conexao.setAutoCommit(false);
			
			return conexao;
			
			
			
		}catch (SQLException | IOException e) {
			
			throw new RuntimeException(e);
		}
	}
	
	private static Properties getProperties() throws IOException{
		Properties prop = new Properties();
		String caminho = "/conexao.properties";
		prop.load(FabricaConexao.class.getResourceAsStream(caminho));
		
		return prop;
	}

}
