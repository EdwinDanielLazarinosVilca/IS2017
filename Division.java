package strategy2;

public class Division implements StrategyOperation {

	@Override
	public int operate(int a,int b) {
		return  a / b;
	}
}
