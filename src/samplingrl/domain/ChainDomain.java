package samplingrl.domain;

import burlap.domain.singleagent.graphdefined.GraphDefinedDomain;
import burlap.oomdp.auxiliary.DomainGenerator;
import burlap.oomdp.core.Domain;

public class ChainDomain extends GraphDefinedDomain {
	
	boolean hasClass = false;

	@Override
	public Domain generateDomain() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {		
		ChainDomain cdg  = new ChainDomain();
		Domain d = cdg.generateDomain();
		
	}
}
