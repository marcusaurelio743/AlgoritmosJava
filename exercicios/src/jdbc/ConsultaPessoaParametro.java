package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultaPessoaParametro {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um nome para consulta");
		String nome = sc.nextLine();
		
		String sql = "select * from pessoa where upper(nome) like upper(?) ";
		
		Connection conexao = FabricaConexao.getConexao();
		
		PreparedStatement statement = conexao.prepareStatement(sql);
		statement.setString(1, "%" +nome+ "%");
		
		ResultSet resultado = statement.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		while(resultado.next()) {
			Pessoa pessoa = new Pessoa(resultado.getInt("codigo"), resultado.getString("nome"));
			pessoas.add(pessoa);
		}
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getCodigo()+" | "+ pessoa.getNome());
		}
		
		
		sc.close();
	}

}
