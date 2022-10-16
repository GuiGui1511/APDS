package dominio;

public class Cozinha {

	private PortaCozinha Porta;
	private boolean americana;
	private float MetragemQuadrada;

	public PortaCozinha getPorta() {
		return Porta;
	}

	public void setPorta(PortaCozinha porta) {
		Porta = porta;
	}

	public boolean isAmericana() {
		return americana;
	}

	public void setAmericana(boolean americana) {
		this.americana = americana;
	}

	public float getMetragemQuadrada() {
		return MetragemQuadrada;
	}

	public void setMetragemQuadrada(float metragemQuadrada) {
		MetragemQuadrada = metragemQuadrada;
	}

}
