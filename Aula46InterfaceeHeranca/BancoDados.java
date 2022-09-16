package Aula46InterfaceeHeranca;

public interface BancoDados extends SqlDCL, SqlDML, SqlDDL{
	
	void abrirConexao();
	void fecharConexao();

}
