package artigotdd.rg.teste;

import artigotdd.rg.RG;
import junit.framework.TestCase;

public class RGTest extends TestCase {

	private RG validarg = new RG();

	public void testIsValidaRG(){
		assertFalse("retorna FALSE – inválido RG", validarg.isValidaRG("128641011"));
		
		assertFalse("retorna FALSE – RG inválido", validarg.isValidaRG(null));
		
		assertFalse("retorna FALSE – RG inválido", validarg.isValidaRG(""));
		
		assertTrue("retorna TRUE – RG válido", validarg.isValidaRG("12864000-28"));
		
		assertTrue(validarg.isValidaRG("abcdefdd-ij"));
	
	}

}
