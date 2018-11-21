package artigotdd.rg.teste;

import artigotdd.rg.RG;
import junit.framework.TestCase;

public class RGTestLetras extends TestCase{

	private RG validarg = new RG();
	
	
	public void testIsValidaRG(){
		assertFalse("retorna FALSE – inválido letras RG", validarg.isValidaRG2("ABCDEFGH-IJ"));
	
		assertFalse("retorna FALSE – Inválido letras RG", validarg.isValidaRG2("G3X8Xopa-22"));
	}
	
}
