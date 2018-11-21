package artigotdd.rg;

public class RG {

	public boolean isValidaRG(String rg) {
		if((rg == null) || (rg.length() != 11) || (rg.isEmpty()) || rg.charAt(8) != '-'){
			return false;

		}
		return true;
	}

	public boolean isValidaRG2(String rg){

		if((rg== null) || (rg.length()!=11)|| (rg.isEmpty()) || rg.charAt(8)!= '-'){
			return false;
		}

		for (int i = 0; i < rg.length(); i++) {
			if(i != 8){
				char posicao = rg.charAt(i);
				
				//senao for um digito retorne false
				if(!Character.isDigit(posicao)){
					return false;

				}
			}
		}
		return true;

	}
	
}
