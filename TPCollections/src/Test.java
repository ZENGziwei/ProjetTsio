//import java.util.LinkedList;
//import java.util.List;
//import java.util.Set;
//import java.util.Calendar;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.HashSet;
//import java.util.Iterator;
import java.util.*;

public class Test {
	public static void main(String[] args) {
		List<Personne> ListPersonne = new LinkedList<Personne>();
		Calendar cal1 = Calendar.getInstance();
		cal1.set(1995,10,24);
		Personne per1 = new Personne("Ines","ZENG",cal1);
		ListPersonne.add(per1);
		Calendar cal2 = Calendar.getInstance();
		cal2.set(1996,2,11);
		Personne per2 = new Personne("Louis","FAN",cal2);
		ListPersonne.add(per2);
		Calendar cal3 = Calendar.getInstance();
		cal3.set(2049,10,24);
		Personne per3= new Personne("Hentie","FAN",cal3);
	//	ListPersonne.add(per3);
		//afficherPersonnse(ListPersonne);
		
		//Collections.reverse(ListPersonne); // 反转	
	//	Collections.shuffle(ListPersonne); //随机打乱
	//	afficherPersonnse(ListPersonne);
		
//		Set<Personne> setPersonne = new HashSet<Personne>();
//		setPersonne.add(per1);
//		setPersonne.add(per2);
//		setPersonne.add(per3);
//		setPersonne.add(per3);
//		afficherPersonnse(setPersonne);
		
		TreeSet<Personne> treePersonne= new TreeSet<Personne>(new ComparatorPersonneAnniversaire());
		treePersonne.add(per1);
		treePersonne.add(per2);
		treePersonne.add(per3);
		afficherPersonnse(treePersonne);
	//	System.out.println(per2.compareTo(per1));
	}
	
	public static void afficherPersonnse(Collection<Personne> ListPersonne) {
		Iterator<Personne> IterPersonne = ListPersonne.iterator();
		while (IterPersonne.hasNext()) {
			Personne item = IterPersonne.next();
			System.out.println(item.toString());
		}

	}
	

}
