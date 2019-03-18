import java.util.*;

/**
 * 
 */

/**
 * @author zengziwei
 *
 */
public class ComparatorPersonneAnniversaire implements Comparator<Personne>{
//	TreeSet<Personne> treePersonne;

	public int compare(Personne x1,Personne x2) {
		return x1.getAnniversaire().compareTo(x2.getAnniversaire());
		
	}
	
	
	

}
