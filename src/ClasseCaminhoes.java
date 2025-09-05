
public class ClasseCaminhoes extends ClasseAutomotores {
	
	float cargaSuportadaAt;
	
	//Super
	
	public ClasseCaminhoes(String corPar, String marcaPar, String modeloPar, String tipoPar, float cargaSuportadaPar) {
		
		super(corPar, marcaPar, modeloPar, tipoPar);
		
		this.cargaSuportadaAt = cargaSuportadaPar;
	}
	//Getters (public + tipo + return)
	public float pegarCargaSuportada() {
		return cargaSuportadaAt;
	}
	//Setters (public void + parâmetros + this)
	
	public void AlterarCargaSuportada(float cargaSuportadaPar){
		this.cargaSuportadaAt = cargaSuportadaPar;
	}
}
