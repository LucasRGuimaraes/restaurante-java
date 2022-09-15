package alimentos;

public class Sopa extends Alimento {

	public Sopa() {
		this.nome = "Sopa";
		this.valor = 5.00f;
	}

	@Override
	public void setValor(Float valor) {
		this.valor = 29.50f;
	}
}
