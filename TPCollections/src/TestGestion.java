import java.util.Calendar;

/**
 * 
 */

/**
 * @author zengziwei
 *
 */
public class TestGestion {
	public static void main(String[] args) {
		GestionnaireContacts gc = new GestionnaireContacts("Family");
		Calendar cal1 = Calendar.getInstance();
		cal1.set(1995,11,24);
		Personne per1 = new Personne("Ines","ZENG",cal1);
		Mail mail1 = new Mail("ZENG ZIWEI","ziwei.zeng95","@gmail.com");
		gc.ajouter(per1, mail1);
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(1996,3,11);
		Personne per2 = new Personne("Louis","FAN",cal2);
		Mail mail2 = new Mail("FAN Jinyuan","jinyuan.fan2017","@gmail.com");
		gc.ajouter(per2, mail2);
		
		Calendar cal3 = Calendar.getInstance();
		cal3.set(2023,10,24);
		Personne per3= new Personne("Hentie","FAN",cal3);
		Mail mail3 = new Mail("FAN Hentie","hentie.fan2017","@gmail.com");
		gc.ajouter(per3, mail3);
		
		Mail mail4 = new Mail("FAN Hentie", "george.fan2019","@gmail.com");
		gc.midifier(per3, mail4);
		
		for (Personne key: gc.personne()) {
			System.out.println(key.toString()+" "+gc.contact(key).toString());
			
			}
		
		for(Personne p: gc.personne("H")) {
			System.out.println(p.toString());
		}
		gc.supprimer(per3);
		for (Personne key: gc.personne()) {
			System.out.println(key.toString()+" "+gc.contact(key).toString());
			
			}
	}

}
