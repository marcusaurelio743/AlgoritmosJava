package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class deletar {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		
		String sql = " select * from pessoa";
		Connection conexao = FabricaConexao.getConexao();
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		PreparedStatement stm = conexao.prepareStatement(sql);
		conexao.commit();
		
		ResultSet resultado = stm.executeQuery();
		
		while(resultado.next()) {
			Pessoa pessoa = new Pessoa(resultado.getInt("codigo"), resultado.getString("nome"));
			pessoas.add(pessoa);
		}
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
		
		
		
		
		System.out.println();
		System.out.println("informe o codigo da pessoa para excluir");
		
		int codigo = sc.nextInt();
		
		sql = "delete from pessoa where codigo="+codigo;
		stm = conexao.prepareStatement(sql);
		stm.execute();
		conexao.commit();
			System.out.println("Registro deletado");
		
		
		sc.close();
	}

}
