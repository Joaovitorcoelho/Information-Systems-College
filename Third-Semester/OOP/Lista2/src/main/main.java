package main;

import exec1.Chefe;
import exec1.Estagiario;
import exec2.Normal;
import exec2.CamaroteSuperior;
import exec2.CamaroteInferior;
import exec3.Administrativo;
import exec3.Tecnico;

public class main {

	public static void main(String[] args) {
		
		// Chefe
		Chefe obj_chefe = new Chefe(123, "Gianluca", "gianlucastarke@gmail.com", 1500.00f, 200f);
		
		obj_chefe.aumentoSalarial(50f);
		System.out.println(obj_chefe.getSalario());
		
		// Estagiario
		Estagiario obj_estagiario = new Estagiario(123, "Gianluca", "gianlucastarke@gmail.com", 1500.00f, 200);
		
		obj_estagiario.aumentoSalarial(50f);
		System.out.println(obj_estagiario.getSalario());
		
		////////////////////////
		
		// Normal
		Normal obj_normal = new Normal(70.00);
		
		System.out.println(obj_normal.getTipoIngresso());
		
		// CamaroteSuperior
		CamaroteSuperior obj_camarote_superior = new CamaroteSuperior(10.00, 70.00, 20.00);
		
		System.out.println(obj_camarote_superior.getValor());
		
		// CamaroteInferior
		CamaroteInferior obj_camarote_inferior = new CamaroteInferior("b20", 70.00, 20.00);
		
		System.out.println(obj_camarote_inferior.getValor());
		System.out.println(obj_camarote_inferior.getLocalizacao());
		
		////////////////////////
		
		// Administrativo
		Administrativo obj_administrativo = new Administrativo(false, 100.00, 123, "Arthemis", "toda_gatinha@gmail.com", "Rua do bobos número 0", "(47) 99999-9999");
		
		System.out.println(obj_administrativo.getTurno());
		System.out.println(obj_administrativo.getAdicionalNoturno());
	}
}
