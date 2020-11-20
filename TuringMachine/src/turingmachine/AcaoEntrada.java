package turingmachine;

import java.util.ArrayList;
import java.util.List;

public class AcaoEntrada {
	List<String> entradas;//para quais entrada devesse executar os comando abaico
	char whiteCaractere;//definir qual caractere a maquina deve escrever conforme a entrada
	char direcao;//determina a direcao que a fita deve se mover conforme a entrada
	String proximoEstado;//qual estado deve ser chamado conforme a entrada

	public void addEntrada(String a) {
		this.entradas.add(a);
	}
	
	public AcaoEntrada() {
		entradas = new ArrayList<String>();
	}

	public AcaoEntrada( char whiteCaractere, char direcao, String proximoEstado) {
		super();
		this.whiteCaractere = whiteCaractere;
		this.direcao = direcao;
		this.proximoEstado = proximoEstado;
	}

	public List<String> getEntradas() {
		return entradas;
	}

	public void setEntradas(List<String> entradas) {
		this.entradas = entradas;
	}

	public char getWhiteCaractere() {
		return whiteCaractere;
	}

	public void setWhiteCaractere(char whiteCaractere) {
		this.whiteCaractere = whiteCaractere;
	}

	public char getDirecao() {
		return direcao;
	}

	public void setDirecao(char direcao) {
		this.direcao = direcao;
	}

	public String getProximoEstado() {
		return proximoEstado;
	}

	public void setProximoEstado(String proximoEstado) {
		this.proximoEstado = proximoEstado;
	}
	
	
}
