package dominio;

public class Cozinha {

	private Porta PortaCozinha;
	private boolean americana;
	private float MetragemQuadrada;

	

	public Porta getPortaCozinha() {
		return PortaCozinha;
	}

	public void setPortaCozinha(Porta portaCozinha) {
		PortaCozinha = portaCozinha;
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
