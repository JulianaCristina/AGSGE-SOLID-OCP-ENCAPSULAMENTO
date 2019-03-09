import java.util.List;

public class Fatura {
	
	private List<Pagamento> pagamentos;
	private boolean pago;
	private double valor;
	
	public void adicionarPagamento(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
		if(valorTotalDosPagamentos()>this.getValor()) {
			this.pago = true;
		}
	}

	private double valorTotalDosPagamentos() {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Pagamento> getPagamentos() {
		// TODO Auto-generated method stub
		return null;
	}

	public double getValor() {
		// TODO Auto-generated method stub
		return 0;
	}

}
