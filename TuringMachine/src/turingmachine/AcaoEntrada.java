package turingmachine;

import java.util.ArrayList;
import java.util.List;

public class AcaoEntrada {
	List<String> entradas;//para quais entrada devesse executar os comando abaico
	String writeCaractere;//definir qual caractere a maquina deve escrever conforme a entrada
	String direcao;//determina a direcao que a fita deve se mover conforme a entrada
	String proximoEstado;//qual estado deve ser chamado conforme a entrada

	public void addEntrada(String a) {
		this.entradas.add(a);
	}
	
	public AcaoEntrada() {
		entradas = new ArrayList<String>();
	}

	public AcaoEntrada( char whiteCaractere, char direcao, String proximoEstado) {
		super();
		this.proximoEstado = proximoEstado;
	}

	public List<String> getEntradas() {
		return entradas;
	}

	public void setEntradas(List<String> entradas) {
		this.entradas = entradas;
	}

	public String getWriteCaractere() {
		return writeCaractere;
	}

	public void setWriteCaractere(String whiteCaractere) {
		this.writeCaractere = whiteCaractere;
	}

	public String getDirecao() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}

	public String getProximoEstado() {
		return proximoEstado;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "direcao " + this.direcao + "write caracter " + this.writeCaractere + " proximo estado " + this.proximoEstado + " Entradas" + this.entradas.toString();
	}

	public void setProximoEstado(String proximoEstado) {
		this.proximoEstado = proximoEstado;
	}
	
	
}
