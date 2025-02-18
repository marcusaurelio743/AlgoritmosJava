package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultaPessoa {

	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoa";
		Statement statement = conexao.createStatement();
		
		ResultSet resultado = statement.executeQuery(sql);
		conexao.commit();
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		while(resultado.next()) {
			Pessoa pessoa = new Pessoa(resultado.getInt("codigo"), resultado.getString("nome"));
			pessoas.add(pessoa);
		}
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getCodigo()+" | "+ pessoa.getNome());
		}
		
		
		statement.close();
		conexao.close();
		
	}

}
