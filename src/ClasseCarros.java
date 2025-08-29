
public class ClasseCarros extends ClasseAutomotores {
	float cargaSuportadaAt;
	
	//Super
	
	public ClasseCarros(String corPar, String marcaPar, String modeloPar, String tipoPar, float cargaSuportadaPar) {
		
		super(corPar, marcaPar, modeloPar, tipoPar);
		
		this.cargaSuportadaAt = cargaSuportadaPar;
	}
}
