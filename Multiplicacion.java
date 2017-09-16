package strategy2;

public class Multiplicacion implements StrategyOperation {

	@Override
	public int operate(int a,int b) {
		return  a * b;
	}
}
