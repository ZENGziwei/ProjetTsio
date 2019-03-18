/**
 * 
 */

/**
 * @author zengziwei
 *
 */
public class Mail extends Contact {
	String identifiant;
	String domain;
   public Mail(String nom, String identifiant, String domain) {
	   super(nom);
	   this.identifiant=identifiant;
	   this.domain=domain;
   }
   
   public String toString() {
	   return this.identifiant+this.domain;
   }
   
}
