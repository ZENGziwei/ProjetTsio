import java.util.*;

public class GestionnaireContacts {
	public Map<Personne,Contact> Hashcontact;
	private String nom;
	public GestionnaireContacts(String nom) {
		this.Hashcontact = new HashMap<Personne,Contact>();
		this.nom = nom;
	}
	public boolean ajouter(Personne p, Contact c) {		
		if (this.Hashcontact.put(p,c)!=null) {return true;}
		else {return false;}
	}
	
	public Contact contact(Personne p) {
		
		return Hashcontact.get(p);
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public boolean midifier(Personne p, Contact c) {
		if (this.Hashcontact.put(p,c)!=null) {return true;}
		else {return false;}
	}
	
	public Set<Personne> personne(){
		return this.Hashcontact.keySet();
	}
	
	public Set<Personne> personne(String prefix){
		Set<Personne> s = new TreeSet<Personne>();
		for (Personne key: this.Hashcontact.keySet()) {
			if(key.getNom().startsWith(prefix)) {
				s.add(key);
			}
		}
		return s;
	}
	
	public boolean supprimer(Personne p) {
		this.Hashcontact.remove(p);
		if (this.Hashcontact.containsKey(p)) {return false;}
		else 
			{return true;}
	}
	
	
	

}
