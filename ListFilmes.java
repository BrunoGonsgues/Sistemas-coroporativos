


public class ListFilmes {
	public static void main(String [] arg){
		try{
			Filme [] filmes = new Filme[]{
				new Filme(1, "A culpa é das estrelas"),
				new Filme(2, "Harry Potter e o Calice de Fogo"),
				new Filme(3, "Jogos vorazes em chamas"),
				new Filme(4, "Doutor Estranho"),
				new Filme(5, "O rei leão"),
				new Filme(6, "Harry Potter e o prisioneiro de Azkaban"),
				new Filme(6, "Ov")
			};
			for(Filme item: filmes){
				System.out.println(item.toString());
			}
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
}