/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletoncalcimposto;

/**
 *
 * @author camil
 */
public class CalcImposto {
    
    private float aliquota;
        
        private static CalcImposto INSTANCE;
    
        private CalcImposto(){
            
        }        
        // Lazy initialization
        public static CalcImposto getINSTANCE(){
            if (INSTANCE ==  null){ // double check - melhor desempenho
                synchronized (CalcImposto.class){
                    if (INSTANCE ==  null) {
                        INSTANCE = new CalcImposto();
                    }
                }
            } return INSTANCE;
        }
	
	public float getAliquota() {
		return aliquota;
	}
	
	public void setAliquota(float aliquota) {
		this.aliquota = aliquota;
	}
	
	public float calcImposto(float valor, float aliquota) {
		return valor * aliquota / 100;
	}
}
