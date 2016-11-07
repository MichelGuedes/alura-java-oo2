public class Data {

	int dia;
	int mes;
	int ano;

	public Data(int diaData, int mesData, int anoData) {
		this.dia = diaData;
		this.mes = mesData;
		this.ano = anoData;
	}

	public String devolveData() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}
