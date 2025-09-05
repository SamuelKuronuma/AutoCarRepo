
public class ClasseCarros extends ClasseAutomotores {
	
	int quantidadePortasAt;
	
	//Super
	
	public ClasseCarros(String corPar, String marcaPar, String modeloPar, String tipoPar, int quantidadePortasPar) {
		
		super(corPar, marcaPar, modeloPar, tipoPar);
		
		this.quantidadePortasAt = quantidadePortasPar;
	}
	//Getters (public + tipo + return)
		public int pegarQuantidadePortas() {
			return quantidadePortasAt;
		}
	//Setters (public void + parâmetros + this)
		
		public void AlterarQuantidadePortas(int quantidadePortasPar){
			this.quantidadePortasAt = quantidadePortasPar;
		}
}
