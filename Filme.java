
public class Filme {
	int codigo;
	
	String nome;
	
	public Filme(int cod, String nome)throws Exception{
		setCodigo(cod);
		setNome(nome);
	}
	
	public static boolean validarNome(String novo){
		boolean resultado=false;
		if(novo.length() > 2){
			resultado = true;
		}else if(novo.toUpperCase()==novo.toString()){
		
			if(novo.length() > 1){
				if(novo.length() > 1){
					resultado = true;
				}
			}
		}
		return resultado;
	}
	
	public String getNome(){
		return nome;
	}
	public int getCodigo(){
		return codigo;
	}
	protected void setNome(String novo)throws Exception{
		if(validarNome(novo)==true){
			this.nome = novo;
		}else {
			throw new NomeInvalidoException();
		}
	}
	
	private void setCodigo(int cod){
		this.codigo = cod;
	}
	public String toString(){
		return getCodigo() + "; " + getNome();
	}
}
class NomeInvalidoException extends Exception {
	public String toString(){
		return "Nome inválido!";
	}
}