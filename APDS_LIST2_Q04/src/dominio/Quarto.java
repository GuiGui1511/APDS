package dominio;

public class Quarto {

	private Porta PortaQuarto;
	private boolean Banheiro;
	private float MetragemQuadrada;

	

	public Porta getPortaQuarto() {
		return PortaQuarto;
	}

	public void setPortaQuarto(Porta portaQuarto) {
		PortaQuarto = portaQuarto;
	}

	public boolean isBanheiro() {
		return Banheiro;
	}

	public void setBanheiro(boolean banheiro) {
		Banheiro = banheiro;
	}

	public float getMetragemQuadrada() {
		return MetragemQuadrada;
	}

	public void setMetragemQuadrada(float metragemQuadrada) {
		MetragemQuadrada = metragemQuadrada;
	}

}
