package guilherme;

import java.util.ArrayList;
import java.util.List;

public class HorarioUtil {

	private List<EntradaSaida> es;
	
	
	public HorarioUtil() {
		es = new ArrayList<EntradaSaida>();
	}
	
	public String calculaHorarioUtil() {
		
		String horarioUtil = "00:00";
		for (EntradaSaida entradaSaida : es) {
			horarioUtil = soma(horarioUtil, diferenca(entradaSaida.getEntrada(),  entradaSaida.getSaida()));
			
		}
		
		return horarioUtil;
	}
	
	public String soma(String in, String out) {
		String [] in_arr = in.split(":");
		
		String in_hour = in_arr[0];
		String in_min = in_arr[1];
		
		String [] out_arr = out.split(":");
		
		String out_hour = out_arr[0];
		String out_min = out_arr[1];

		Integer out_hour_num = Integer.parseInt(out_hour);
		Integer out_min_num = Integer.parseInt(out_min);
		
		Integer in_hour_num = Integer.parseInt(in_hour);
		Integer in_min_num = Integer.parseInt(in_min);
		
		Integer res_hour = out_hour_num + in_hour_num;
		Integer res_min = out_min_num + in_min_num;
		
		String res = "00:00";
		
		Integer rest;
		Integer h = 0;
		if((h = res_min / 60) > 0) {
			res_hour+=h;
			res_min =(res_min % 60);
		}
			
		if(res_hour < 10) {
			res = "0"+res_hour;
		}else {
			res = ""+res_hour;
		}
		
		if(res_min < 10) {
			res = res+":0"+res_min;
		}else {
			res = res+":"+res_min;
		}
		
		
		return res;
	}
	
	public String diferenca(String in, String out) {

		String [] in_arr = in.split(":");
		
		String in_hour = in_arr[0];
		String in_min = in_arr[1];
		
		String [] out_arr = out.split(":");
		
		String out_hour = out_arr[0];
		String out_min = out_arr[1];
		
		String res = "00:00";

		Integer out_min_num = Integer.parseInt(out_min);
		Integer in_min_num = Integer.parseInt(in_min);
		
		Integer res_num = out_min_num - in_min_num;
		
		if(in_hour.equals(out_hour) && res_num >= 0) {
			if(res_num < 10) {
				res = "00:0"+res_num;				
			}else {
				res = "00:"+res_num;			
			}

		}else {
			Integer out_hour_num = Integer.parseInt(out_hour);
			Integer in_hour_num = Integer.parseInt(in_hour);
			
			Integer res_hour_num = out_hour_num - in_hour_num;

			if(res_hour_num < 0)
				res_hour_num = res_hour_num * -1;

			if(res_num < 0) {
				res_hour_num-=1;
				res_num+=60;
			}
			
			if(res_hour_num < 10) {
				res = "0"+res_hour_num;				
			}else {
				res = ""+res_hour_num;
			}

			if(res_num < 10) {
				res = res+":0"+res_num;				
			}else {
				res = res+":"+res_num;			
			}
		}
		
		return res;
		
	}
	
	public void setEntradaSaida(String entrada, String saida) {
		if(!entrada.isEmpty() && !saida.isEmpty())
			es.add(new EntradaSaida(entrada, saida));
	}
	
	
}
