import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

/**
 * Santas List stores a variety of ways to access information as kids
 * Stack - Elve's orders
 * List - List of kids
 * Queue - Present giving order
 * Map - Kids's present : Kid's Name
 * Set - Set of presents
 * @author tyler
 *
 */
public class SantasLists {

	private Stack<String> orders;
	private ArrayList<String> nameList;
	private PriorityQueue<String> deliveryOrder;
	private TreeMap<String, String> matchList;
	private HashSet<String> presents;
	
	public SantasLists() {
		orders = new Stack<String>();
		nameList = new ArrayList<String>();
		deliveryOrder= new PriorityQueue<String>();
		matchList = new TreeMap<String, String>();
		presents = new HashSet<String>();
	}
	
	//Adds a kid and their present to the lists, if they are naughty give them coal
	public void addEntry(Kid kid) {
		String present = kid.getPresent();
		String name = kid.getName();
		if(!kid.isNiceness()) {
			present = "Coal";
		}
		orders.add(name);
		nameList.add(name);
		deliveryOrder.add(present);
		matchList.put(present, name);
		presents.add(present);
	}

	/**
	 * @return the orders
	 */
	public Stack<String> getOrders() {
		return orders;
	}

	/**
	 * @return the kidList
	 */
	public List<String> getNameList() {
		return nameList;
	}

	/**
	 * @return the deliveryOrder
	 */
	public Queue<String> getDeliveryOrder() {
		return deliveryOrder;
	}

	/**
	 * @return the matchList
	 */
	public Map<String, String> getMatchList() {
		return matchList;
	}

	/**
	 * @return the presents
	 */
	public Set<String> getPresents() {
		return presents;
	}

	
}
