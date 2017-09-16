package strategy2;

public class MCD implements StrategyOperation{
	
	@Override
	public int operate(int a , int b) {
		return a!=b ? ( a>b ? operate(a-b,b) :operate(a,b-a)) :a;

	}

}
