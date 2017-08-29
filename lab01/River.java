package lab01;
public class River extends BodyOfWater {
	private BodyOfWater flowsInto;
	private int riverLength;
	
	public River(String aName, BodyOfWater flInto, int len) {
		super(aName);
		flowsInto = flInto;
		riverLength = len;
	}
	
	public int getRiverLength() {
		return riverLength;
	}
	
	public BodyOfWater getFlowsInto() {
		return flowsInto;
	}
	
	/**
	 * This method returns the name of the final body of water that can be reached from this river.
	 * @return name of the final body of water that can be reached from this river.
	 */
	public String flowsOutTo() {
		if(flowsInto instanceof River) {
			return ((River)flowsInto).flowsOutTo();
		} else {
			return flowsInto.getName(); 
		}
	}
}
