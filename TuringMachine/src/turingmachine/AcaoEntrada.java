package turingmachine;

import java.util.ArrayList;
import java.util.List;

public class AcaoEntrada {
	String entradas;//para quais entrada devesse executar os comando abaico
	String writeCaractere;//definir qual caractere a maquina deve escrever conforme a entrada
	String direcao;//determina a direcao que a fita deve se mover conforme a entrada
	String proximoEstado;//qual estado deve ser chamado conforme a entrada

        public AcaoEntrada() {
        }

           

	public AcaoEntrada( char whiteCaractere, char direcao, String proximoEstado) {
		super();
		this.proximoEstado = proximoEstado;
	}

	public String getEntradas() {
		return entradas;
	}

	public void setEntradas(String entradas) {
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
		return  this.direcao + "|" + this.writeCaractere + "|" + this.proximoEstado; 
	}

	public void setProximoEstado(String proximoEstado) {
		this.proximoEstado = proximoEstado;
	}
	
	
}
